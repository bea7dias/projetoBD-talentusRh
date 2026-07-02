# Talentus RH - Sistema de Gestão de Recursos Humanos

Este sistema foi desenvolvido como uma atividade avaliativa para a disciplina de Banco de Dados do curso de Bacharelado em Engenharia da Computação da Universidade Estadual do Maranhão (UEMA).

##### Autores: 
- Anna Beatriz Dias Cardoso
- Camila Luiza Silva Machado
- Marcos Gabriel Silva Cordeiro

### 📄 Documentação do Projeto
* **Documento Principal:** [Acessar documento completo no Google Docs](https://docs.google.com/document/d/13wkfDSgGlnWveZ8LfTvFapXwPpOjBqb2P9J6917QxQ4/edit?usp=sharing)

---

### Descrição do Projeto

O sistema **Talentus RH** tem como objetivo automatizar os processos de recrutamento e seleção de uma empresa de Recursos Humanos. O software permite o gerenciamento de empresas parceiras, vagas abertas, fluxo de candidaturas, controle de entrevistas e registro de contratações. 

### Tecnologia e Arquitetura

* **Linguagem/Framework:** Java com Spring Boot
* **Banco de Dados:** MySQL
* **Arquitetura:** Projeto estruturado em camadas lógicas (`Entity`, `Repository`, `Service` e `Controller`), garantindo organização, legibilidade e separação de responsabilidades.
* **Documentação da API:** Swagger (OpenAPI)

---

### Funcionalidades Principais (Requisitos Funcionais)

#### Cadastros e Gerenciamento
* **Empresas Parceiras:** Permite a inclusão, alteração e remoção de dados de empresas (CNPJ, nome, telefone, email, endereço).
* **Vagas:** Gerencia vagas associadas a empresas com status de aberta, fechada, suspensa ou pausada.
* **Candidatos:** Cadastro de candidatos com informações como nome, email, CPF, telefone e pretensão salarial.
* **Experiências:** Permite a múltipla associação de experiências profissionais ao candidato.
* **Funcionários (Recrutadores):** Gerencia os profissionais internos responsáveis pelos processos seletivos.

#### Fluxo de Candidatura
O sistema controla o processo em três etapas sequenciais:
1.  **Triagem:** Entrada da candidatura, registro da data de interesse e geração do identificador único.
2.  **Avaliação:** Registro de entrevistas, testes, notas e avaliação dos recrutadores.
3.  **Fechamento:** Definição da aprovação ou reprovação do candidato. 

#### Gestão de Contratação e Garantia
* O sistema registra contratações com data de início, data de rescisão e prazo de garantia.
* Automatiza a alteração do status da vaga conforme o andamento do processo.
* Reabre vagas automaticamente caso o candidato seja demitido dentro do prazo de garantia estabelecido em contrato.

---

### Entregáveis de Banco de Dados

*  **CRUD Completo:** Todos os endpoints (GET, POST, PUT, DELETE) funcionando corretamente, com respostas HTTP adequadas e tratamento de erro para as entidades do sistema.
*  **Consultas SQL Nativas:** Implementação de no mínimo 6 consultas complexas mapeadas diretamente no banco, servindo aos seguintes relatórios do sistema:
    * *Ficha de avaliação de entrevistas:* Dados do candidato e da vaga com campos para observações.
    * *Vagas críticas:* Identificação de vagas abertas sem candidatos ou abaixo do mínimo desejado.
    * *Produtividade de recrutadores:* Demonstrativo de entrevistas realizadas e candidatos aprovados por recrutador.
    * *Agenda de entrevistas:* Detalhamento de entrevistas organizadas por período e por funcionário.
    * *Garantia a vencer:* Relatório de contratos com prazos de garantia prestes a expirar.

---

## Instruções de Execução

**1. Pré-requisitos**
Certifique-se de ter as seguintes ferramentas instaladas e configuradas em sua máquina:
* **Git**
* **JDK 17** ou superior
* **Maven**
* **SGBD MySQL** 
* **Uma Ide compatível com Java"**
