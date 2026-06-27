
-- SELECTS - Sistema RH

USE banco_rh;

-- Requisito 10 - Ficha de avaliação de entrevistas
SELECT 
    c.nome AS candidato,
    c.cpf,
    c.email,
    c.telefone,
    v.cargo AS vaga,
    e.data_hora,
    e.nota,
    e.avaliacao_final,
    f.nome AS recrutador
FROM Entrevista e
JOIN Candidatura can ON e.id_candidatura = can.id
JOIN Candidato c ON can.id_candidato = c.id
JOIN Vaga v ON can.id_vaga = v.id
JOIN Funcionario f ON e.id_funcionario = f.id
ORDER BY e.data_hora;

-- Requisito 11 - Vagas Críticas
SELECT 
    emp.nome AS empresa,
    v.cargo,
    v.status,
    COUNT(can.id) AS total_candidatos,
    DATEDIFF(CURDATE(), MIN(can.data_interesse)) AS dias_em_aberto
FROM Vaga v
JOIN Empresa emp ON v.id_empresa = emp.id
LEFT JOIN Candidatura can ON v.id = can.id_vaga
WHERE v.status = 'Aberta'
GROUP BY v.id, emp.nome, v.cargo, v.status, v.qtd_vagas
HAVING COUNT(can.id) = 0 
    OR COUNT(can.id) < v.qtd_vagas
ORDER BY dias_em_aberto DESC;

-- Requisito 12 - Produtividade dos recrutadores
SELECT 
    f.nome AS recrutador,
    COUNT(e.id) AS total_entrevistas,
    SUM(CASE WHEN can.resultado_final = 'Aprovado' THEN 1 ELSE 0 END) AS total_aprovados
FROM Funcionario f
LEFT JOIN Entrevista e ON f.id = e.id_funcionario
LEFT JOIN Candidatura can ON e.id_candidatura = can.id
GROUP BY f.id, f.nome
ORDER BY total_entrevistas DESC;

-- Requisito 13 - Vagas abertas com candidatos na triagem
SELECT 
    emp.nome AS empresa,
    v.cargo,
    v.status,
    COUNT(can.id) AS candidatos_triagem
FROM Vaga v
JOIN Empresa emp ON v.id_empresa = emp.id
LEFT JOIN Candidatura can ON v.id = can.id_vaga AND can.etapa_atual = 'Triagem'
WHERE v.status = 'Aberta'
GROUP BY v.id, emp.nome, v.cargo, v.status
ORDER BY emp.nome;

-- Requisito 14 - Agenda de entrevistas por recrutador
SELECT 
    f.nome AS recrutador,
    e.data_hora,
    c.nome AS candidato,
    v.cargo AS vaga
FROM Entrevista e
JOIN Funcionario f ON e.id_funcionario = f.id
JOIN Candidatura can ON e.id_candidatura = can.id
JOIN Candidato c ON can.id_candidato = c.id
JOIN Vaga v ON can.id_vaga = v.id
ORDER BY f.nome, e.data_hora;

-- Requisito 15 - Garantias a vencer
SELECT 
    c.nome AS candidato,
    emp.nome AS empresa,
    co.data_inicio,
    DATE_ADD(co.data_inicio, INTERVAL co.dias_garantia DAY) AS data_fim_garantia,
    DATEDIFF(DATE_ADD(co.data_inicio, INTERVAL co.dias_garantia DAY), CURDATE()) AS dias_restantes
FROM Contratacao co
JOIN Candidatura can ON co.id_candidatura = can.id
JOIN Candidato c ON can.id_candidato = c.id
JOIN Vaga v ON can.id_vaga = v.id
JOIN Empresa emp ON v.id_empresa = emp.id
WHERE co.data_rescisao IS NULL
ORDER BY data_fim_garantia ASC;

-- triggers pra testes: 

select * from vaga;

select * from candidatura;

select * from candidato;

SELECT nome, email, telefone 
FROM Funcionario;

-- mostrar vagas abertas
SELECT cargo, qtd_vagas, `status` 
FROM Vaga 
WHERE status = 'Aberta';

-- busca candidatos com pretensao menor que 4000 e ordena pela pretensão
SELECT nome, email, pretensao_salarial 
FROM Candidato 
WHERE pretensao_salarial <= 4000.00
ORDER BY pretensao_salarial DESC;

-- mostra o nome do candidato e a etapa em que está
SELECT 
    Cand.nome AS nome_do_candidato, 
    Cand.cpf, 
    C.data_interesse, 
    C.etapa_atual
FROM Candidatura C
INNER JOIN Candidato Cand ON C.id_candidato = Cand.id;