DELIMITER //
CREATE PROCEDURE `sp_nova_candidatura`(
    IN p_nome VARCHAR(110),
    IN p_cpf VARCHAR(11),
    IN p_email VARCHAR(100),
    IN p_telefone VARCHAR(20),
    IN p_pretensao DECIMAL(10,2),
    IN p_id_vaga BIGINT UNSIGNED
)
BEGIN
    DECLARE v_id_candidato BIGINT UNSIGNED;

    -- Verifica se o candidato já existe pelo CPF
    SELECT id INTO v_id_candidato FROM `Candidato` WHERE cpf = p_cpf LIMIT 1;

    -- Insere novo, se ele não exitir
    IF v_id_candidato IS NULL THEN
        INSERT INTO `Candidato` (nome, cpf, email, telefone, pretensao_salarial)
        VALUES (p_nome, p_cpf, p_email, p_telefone, p_pretensao);
        
        SET v_id_candidato = LAST_INSERT_ID();
    END IF;

    -- Cria a candidatura (dá um insert na tabela candidatura)
    INSERT INTO `Candidatura` (id_candidato, id_vaga, data_interesse, etapa_atual, resultado_final)
    VALUES (v_id_candidato, p_id_vaga, CURDATE(), 'Triagem', NULL);

END //
DELIMITER ;
       
       
DELIMITER //
CREATE PROCEDURE sp_registrar_contratacao(
    IN p_id_candidatura VARCHAR(36),
    IN p_data_inicio DATE,
    IN p_dias_garantia INT
)
BEGIN
    -- insere na tabela de contratação 
    INSERT INTO Contratacao (id_candidatura, data_inicio, dias_garantia)
    VALUES (p_id_candidatura, p_data_inicio, p_dias_garantia);
    
	-- atualiza o resultado do candidato e a etapa para fechamento
    UPDATE Candidatura 
    SET resultado_final = 'Aprovado', etapa_atual = 'Fechamento' 
    WHERE id = p_id_candidatura;
    
END//
DELIMITER ;

-- CALL sp_registrar_contratacao(;

-- Cadastrando um candidato novo para a Vaga ID 1
-- CALL sp_nova_candidatura('João da Silva', '00011122233', 'joao.novo@email.com', '11999998888', 6000.00, 6);

