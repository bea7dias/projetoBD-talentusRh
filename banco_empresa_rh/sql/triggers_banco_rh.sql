use banco_rh;


-- gatilho pra diminuir a qtd de vagas da tabela Vaga pós uma contratação
DELIMITER //
CREATE TRIGGER trg_abater_qtd_vagas
AFTER INSERT ON Contratacao
FOR EACH ROW
BEGIN
    UPDATE Vaga v
    JOIN Candidatura c ON v.id = c.id_vaga
    SET v.qtd_vagas = v.qtd_vagas - 1
    WHERE c.cod_unico = NEW. id_candidatura 
    AND v.qtd_vagas > 0;
END //
DELIMITER ;

-- define uma vaga como fechada, impedindo candidaturas 
DELIMITER //
CREATE TRIGGER trg_fechar_vaga_apos_contrato
AFTER INSERT ON Contratacao
FOR EACH ROW
BEGIN
    -- Atualiza o status da Vaga cruzando os dados com a Candidatura
    UPDATE Vaga v
    JOIN Candidatura c ON v.id = c.id_vaga
    SET v.status = 'Fechada'
    WHERE c.id = NEW.id_candidatura;
END //
DELIMITER ;


-- bloqueia candidatura em vagas fechadas, etc
DELIMITER //
CREATE TRIGGER trg_bloquear_candidatura_vaga_inativa
BEFORE INSERT ON Candidatura
FOR EACH ROW
BEGIN
    DECLARE v_status ENUM('Aberta', 'Fechada', 'Suspensa', 'Pausada');
    
    -- busca o status atual da vaga 
    SELECT status INTO v_status 
    FROM Vaga 
    WHERE id = NEW.id_vaga;
    
    -- bloqueia vagas diferentes de aberta
    IF v_status != 'Aberta' THEN
        SIGNAL SQLSTATE '45000' 
        SET MESSAGE_TEXT = 'Bloqueio do Banco: Esta vaga não está aberta para novas candidaturas.';
    END IF;
END //
DELIMITER ;


-- bloqueia entrevista pra candidato reprovado na etapa anterior
DELIMITER //
CREATE TRIGGER trg_travar_entrevista_reprovado
BEFORE INSERT ON Entrevista
FOR EACH ROW
BEGIN
    DECLARE v_resultado ENUM('Aprovado', 'Reprovado', 'Em Andamento');
    
    -- acha todos os resultados de candidatura
    SELECT resultado_final INTO v_resultado 
    FROM Candidatura 
    WHERE id = NEW.id_candidatura;
    
    -- se estiver reprovado, reporta erro e bloqueia a entrevista
    IF v_resultado = 'Reprovado' THEN
        SIGNAL SQLSTATE '45000' 
        SET MESSAGE_TEXT = 'Operação Bloqueada: Não é possível agendar entrevista para um candidato reprovado.';
    END IF;
END //
DELIMITER ;