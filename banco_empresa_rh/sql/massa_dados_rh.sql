USE `banco_rh`;

-- -----------------------------------------------------
-- 1. EMPRESAS (15 registros)
-- -----------------------------------------------------
INSERT INTO `Empresa` (`cnpj`, `nome`, `telefone`, `email`, `endereco`) VALUES
('12345678000101', 'Tech Solutions', '11988887777', 'hr@techsolutions.com', 'Av Paulista, 1000 - SP'),
('23456789000102', 'Inova Digital', '11977776666', 'vagas@inova.com.br', 'Rua Augusta, 500 - SP'),
('34567890000103', 'Logistics Pro', '21966665555', 'contato@logpro.com', 'Av Rio Branco, 10 - RJ'),
('45678901000104', 'Health Tech', '31955554444', 'rh@healthtech.com', 'Rua Bahia, 300 - MG'),
('56789012000105', 'Finance Corp', '41944443333', 'jobs@fincorp.com', 'Av das Nações, 1500 - PR'),
('67890123000106', 'Educa Mais', '51933332222', 'talento@educamais.com', 'Rua dos Bobos, 0 - RS'),
('78901234000107', 'Cyber Security SA', '61922221111', 'security@cyber.com', 'Setor Comercial Sul - DF'),
('89012345000108', 'Green Energy', '71911110000', 'rh@green.com', 'Orla de Salvador, 50 - BA'),
('90123456000109', 'Retail King', '81900009999', 'vagas@retailking.com', 'Recife Antigo, 12 - PE'),
('01234567000110', 'Build It', '11912341234', 'construtora@buildit.com', 'Marginal Pinheiros, 200 - SP'),
('11223344000111', 'Soft House', '11923452345', 'dev@softhouse.com', 'Berrini, 450 - SP'),
('22334455000112', 'Marketing 360', '11934563456', 'jobs@mkt360.com', 'Vila Madalena, 88 - SP'),
('33445566000113', 'Agro Tech', '62945674567', 'rh@agrotech.com', 'Fazenda Exp, KM 12 - GO'),
('44556677000114', 'Auto Speed', '11956785678', 'mecanica@autospeed.com', 'Interlagos, 1000 - SP'),
('55667788000115', 'Cloud Nine', '11967896789', 'vagas@cloud9.com', 'Faria Lima, 3500 - SP');

-- -----------------------------------------------------
-- 2. VAGAS (15 registros)
-- -----------------------------------------------------
INSERT INTO `Vaga` (`id_empresa`, `cargo`, `descricao`, `status`, `qtd_vagas`) VALUES
(1, 'Dev Backend Jr', 'Java e Spring Boot', 'Aberta', 3),
(1, 'Dev Frontend Sr', 'React e TypeScript', 'Aberta', 1),
(2, 'Designer UX', 'Figma e Research', 'Aberta', 2),
(3, 'Analista de Frota', 'Gestão de caminhões', 'Aberta', 5),
(4, 'Enfermeiro Auditor', 'Auditoria de contas', 'Pausada', 1),
(5, 'Analista Financeiro', 'Contas a pagar/receber', 'Fechada', 1),
(6, 'Professor de Inglês', 'Nível avançado', 'Aberta', 10),
(7, 'Analista de SOC', 'Monitoramento de redes', 'Aberta', 2),
(8, 'Engenheiro Ambiental', 'Licenciamento', 'Suspensa', 1),
(9, 'Gerente de Loja', 'Gestão de pessoas', 'Aberta', 1),
(10, 'Mestre de Obras', 'Leitura de projetos', 'Aberta', 2),
(11, 'QA Engineer', 'Automação de testes', 'Aberta', 2),
(12, 'Social Media', 'Gestão de Redes Sociais', 'Aberta', 1),
(13, 'Operador de Trator', 'Experiência em campo', 'Aberta', 4),
(15, 'SRE Sênior', 'Kubernetes e AWS', 'Aberta', 1);

-- -----------------------------------------------------
-- 3. CANDIDATOS (15 registros)
-- -----------------------------------------------------
INSERT INTO `Candidato` (`nome`, `cpf`, `email`, `telefone`, `pretensao_salarial`) VALUES
('Alice Silva', '12312312311', 'alice@email.com', '11900010001', 5000.00),
('Bruno Souza', '23423423422', 'bruno@email.com', '11900020002', 7500.00),
('Carla Dias', '34534534533', 'carla@email.com', '21900030003', 4200.00),
('Daniel Melo', '45645645644', 'daniel@email.com', '31900040004', 12000.00),
('Eduarda Paz', '56756756755', 'eduarda@email.com', '41900050005', 3500.00),
('Fabio Lima', '67867867866', 'fabio@email.com', '51900060006', 9000.00),
('Gabriel Vaz', '78978978977', 'gabriel@email.com', '61900070007', 6000.00),
('Helena Luz', '89089089088', 'helena@email.com', '71900080008', 5500.00),
('Igor Santos', '90190190199', 'igor@email.com', '81900090009', 8000.00),
('Julia Reis', '01201201200', 'julia@email.com', '11900100010', 4800.00),
('Kevin Costner', '12112112111', 'kevin@email.com', '11900110011', 15000.00),
('Larissa Mano', '23223223222', 'larissa@email.com', '11900120012', 3000.00),
('Mauricio Meire', '34334334333', 'mau@email.com', '11900130013', 5500.00),
('Nina Abrantes', '45445445444', 'nina@email.com', '11900140014', 6200.00),
('Otavio Mesquita', '56556556555', 'otavio@email.com', '11900150015', 20000.00);

-- -----------------------------------------------------
-- 4. FUNCIONÁRIOS (15 registros)
-- -----------------------------------------------------
INSERT INTO `Funcionario` (`nome`, `cpf`, `email`, `telefone`, `cargo`, `salario`) VALUES
('Ricardo RH', '11122233344', 'ricardo@bancorh.com', '1140028922', 'Recrutador Sênior', 8000.00),
('Fernanda Tech', '22233344455', 'fernanda@bancorh.com', '1140028923', 'Tech Lead', 15000.00),
('Marcos Manager', '33344455566', 'marcos@bancorh.com', '1140028924', 'Gerente de Contratos', 12000.00),
('Aline People', '44455566677', 'aline@bancorh.com', '1140028925', 'Analista de DP', 4500.00),
('Paulo Boss', '55566677788', 'paulo@bancorh.com', '1140028926', 'Diretor Operacional', 25000.00),
('Beatriz HR', '66677788899', 'beatriz@bancorh.com', '1140028927', 'Recrutador Jr', 3500.00),
('Caio Dev', '77788899900', 'caio@bancorh.com', '1140028928', 'Desenvolvedor Staff', 18000.00),
('Dora Admin', '88899900011', 'dora@bancorh.com', '1140028929', 'Secretária Executiva', 4000.00),
('Enzo Mkt', '99900011122', 'enzo@bancorh.com', '1140028930', 'Analista de Marca', 6000.00),
('Flavia Psico', '00011122233', 'flavia@bancorh.com', '1140028931', 'Psicóloga', 7000.00),
('Guto Finance', '12121212112', 'guto@bancorh.com', '1140028932', 'CFO', 22000.00),
('Hilda Suporte', '34343434334', 'hilda@bancorh.com', '1140028933', 'Analista Suporte', 3800.00),
('Ivan Redes', '56565656556', 'ivan@bancorh.com', '1140028934', 'Analista Infra', 8500.00),
('Joana Vendas', '78787878778', 'joana@bancorh.com', '1140028935', 'Executiva Vendas', 9000.00),
('Kelly Juridico', '90909090990', 'kelly@bancorh.com', '1140028936', 'Advogada', 11000.00);

-- -----------------------------------------------------
-- 5. EXPERIÊNCIAS (15 registros)
-- -----------------------------------------------------
INSERT INTO `Experiencia` (`nome_experiencia`, `categoria`, `descricao_experiencia`) VALUES
('Java 17', 'Backend', 'Domínio em JDK 17 e Streams API'),
('React Native', 'Mobile', 'Desenvolvimento de apps híbridos'),
('AWS Cloud', 'Infra', 'Gestão de instâncias EC2 e S3'),
('Scrum', 'Metodologia', 'Vivência em rituais ágeis'),
('Inglês Fluente', 'Idiomas', 'Capacidade de conversação técnica'),
('Python/Pandas', 'Dados', 'Manipulação de grandes volumes'),
('Figma', 'Design', 'Criação de protótipos'),
('Gestão de Equipes', 'Liderança', 'Liderança de times de 5+ pessoas'),
('Excel Avançado', 'Ferramentas', 'Macros e VBA'),
('Kubernetes', 'DevOps', 'Orquestração de containers'),
('Direito do Trabalho', 'Juridico', 'Conhecimento profundo em CLT'),
('Vendas B2B', 'Comercial', 'Prospecção de grandes contas'),
('SAP', 'ERP', 'Módulo de logística'),
('Docker', 'Infra', 'Criação de imagens'),
('Node.js', 'Backend', 'Express e Fastify');

-- -----------------------------------------------------
-- 6. CANDIDATO_EXPERIENCIA (15 registros)
-- -----------------------------------------------------
INSERT INTO `Candidato_Experiencia` (`Candidato_id`, `Experiencia_id`) VALUES
(1, 1), (1, 4), (1, 14), 
(2, 2), (2, 5), 
(3, 7), 
(4, 10), (4, 3), 
(5, 9), 
(6, 6), 
(7, 5), 
(8, 11), 
(9, 12), 
(10, 13), 
(11, 8);

-- -----------------------------------------------------
-- 7. CANDIDATURAS (15 registros)
-- -----------------------------------------------------
INSERT INTO `Candidatura` (`id_candidato`, `id_vaga`, `data_interesse`, `etapa_atual`, `resultado_final`) VALUES
(1, 1, '2026-05-20', 'Fechamento', 'Aprovado'),
(2, 2, '2026-05-21', 'Avaliacao', NULL),
(3, 3, '2026-05-22', 'Triagem', NULL),
(4, 15, '2026-05-22', 'Avaliacao', NULL),
(5, 4, '2026-05-23', 'Triagem', NULL),
(6, 8, '2026-05-23', 'Avaliacao', NULL),
(7, 7, '2026-05-24', 'Fechamento', 'Reprovado'),
(8, 5, '2026-05-24', 'Triagem', NULL),
(9, 12, '2026-05-25', 'Avaliacao', NULL),
(10, 14, '2026-05-25', 'Triagem', NULL),
(11, 15, '2026-05-26', 'Triagem', NULL),
(12, 6, '2026-05-26', 'Fechamento', 'Aprovado'),
(13, 11, '2026-05-26', 'Triagem', NULL),
(14, 13, '2026-05-27', 'Avaliacao', NULL),
(15, 10, '2026-05-27', 'Fechamento', 'Reprovado');

-- -----------------------------------------------------
-- 8. ENTREVISTAS (15 registros)
-- -----------------------------------------------------
INSERT INTO `Entrevista` (`id_funcionario`, `id_candidatura`, `data_hora`, `nota`, `avaliacao_final`, `ordem_etapa`) VALUES
(1, 1, '2026-05-22 10:00:00', 9.50, 'Candidato excelente tecnicamente', 1),
(2, 1, '2026-05-23 14:00:00', 8.50, 'Ótimo fit cultural', 2),
(1, 2, '2026-05-22 11:00:00', 7.00, 'Conhecimento básico', 1),
(6, 3, '2026-05-23 09:00:00', 6.50, 'Interessante, mas faltou prática', 1),
(7, 4, '2026-05-24 16:00:00', 9.00, 'Domina infraestrutura', 1),
(1, 7, '2026-05-25 10:00:00', 4.00, 'Faltou idioma exigido', 1),
(2, 9, '2026-05-26 13:00:00', 8.00, 'Boa experiência comercial', 1),
(6, 12, '2026-05-27 10:30:00', 9.00, 'Didática excelente', 1),
(10, 12, '2026-05-27 15:00:00', 9.90, 'Perfeita para a vaga', 2),
(1, 14, '2026-05-28 09:00:00', 7.50, 'Possui as certificações necessárias', 1),
(1, 15, '2026-05-28 11:00:00', 5.00, 'Expectativa salarial muito alta', 1),
(2, 4, '2026-05-25 14:00:00', 8.00, 'Aprovado para board técnico', 2),
(6, 6, '2026-05-24 10:00:00', 7.00, 'Perfil analítico bom', 1),
(1, 13, '2026-05-21 09:00:00', 8.00, 'Triagem positiva', 1),
(6, 8, '2026-05-21 15:00:00', 7.50, 'Segue para próxima fase', 1);

-- -----------------------------------------------------
-- 9. CONTRATAÇÕES (15 registros)
-- -----------------------------------------------------
INSERT INTO `Contratacao` (`id_candidatura`, `data_inicio`, `data_rescisao`, `dias_garantia`) VALUES
(1, '2026-06-01', NULL, 90),
(12, '2026-06-05', NULL, 45),
(2, '2026-07-01', NULL, 90),
(4, '2026-06-15', NULL, 90),
(6, '2026-06-25', NULL, 90),
(9, '2026-07-15', NULL, 90),
(14, '2026-08-10', NULL, 90),
(10, '2026-07-20', NULL, 90),
(11, '2026-07-25', NULL, 90),
(13, '2026-08-05', NULL, 90),
(3, '2026-06-10', NULL, 90),
(5, '2026-06-12', NULL, 30),
(8, '2026-07-05', NULL, 90),
(1, '2024-01-10', '2025-01-10', 90), 
(2, '2025-02-01', '2025-08-01', 90);