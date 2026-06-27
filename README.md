# Talentus RH - Sistema de Gestão de Recursos Humanos
  Esse sistema foi desenvolvido como uma atividade avaliativa para a disciplina de Banco de Dados do curso de Bacharelado em Engenharia da Computação da Universidade Estadual do Maranhão (UEMA).

##### Autores: 
- Anna Beatriz Dias Cardoso
- Camila Luiza Silva Machado
- Marcos Gabriel Silva Cordeiro

### Descrição do projeto

O sistema "Talentus RH" tem como objetivo automatizar os processos de recrutamento e seleção de uma empresa de Recursos Humanod. O software permite o gerenciamento de empresas parceiras, vagas abertas, fluxo de candidaturas, controle de entrevistas e registro de contratações. 

### Funcionalidades principais (Requisitos funcionais)
  #### Cadastros e gerenciamento
  - **Empresas Parceiras:** Permite a inclusão, alteração e remoção de dados de empresas (CNPJ, nome, telefone, email, endereço).
  - **Vagas:** Gerencia vagas associadas a empresas com status de aberta, fechada, suspensa, pausada.
  - **Candidatos:** Cadastro de candidatos com informações como nome, email, CPF, telefone e pretensão salarial.
  - **Experiências:** Permite a múltipla associação de experiências profissionais ao candidato.
  - **Funcionários(Recrutadores):** Gerencia os profissionais internos responsáveis pelos processos seletivos.

### Fluxo de Candidatura
O sisema controla o processo em **três** etapas sequenciais:
- **Triagem:** Entrada da candidatura, registro da data de interesse e geração do identificador único.
- **Avaliação:** Registro de entrevistas, testes, notas e avaliação dos recrutadores.
- **Fechamento:** Definição da aprovação ou reprovação do candidato. 

### Gestão de contratação e garantia

- O sistema registra contratações com data de inicio , data de rescisão e prazo de garantia.
- Automatiza a alteração do status da vaga.
- Reabre vagas automaticamente caso o candidato seja demitido dentro do prazo de garantia. 

### Relatórios disponíveis

- **Ficha de avaliação de entrevistas:** Dados do candidato e da vaga com campos para observações.
- **Vagas críticas:** Identificar vagas abertas sem candidatos ou abaixo do minimo desejado.
- **Produtividade de recrutadores:** Demonstrativo de entrevistas realizadas e candidatos aprovados por recrutador.
- **Agenda de entrevistas:** Detalhamento de entrevistas por período e por funcionário.
- **Garantia a vencer:** Relatório de contratos com prazos de garantia prestes a expirar. 

### Requisitos não funcionais
- **Confiabilidade:** Recuperação de dados pós-falha e suporte a backups diários.
- **Eficiência:** Consultas online com tempo de execução inferior a 5 segundos e impressão de relatórios em até 20 segundos.
- **Portabilidade:** Execução em Windows 10/11 ou superior compatibilidade com bases de dados relacionais corporativas. 
- **Escalabilidade:** Arquitetura flexível para suportar o crescimento da empresa e integração futura com novas tecnologiais. 

### 🔗 Links Importantes

- 📄 **Documentação do Projeto**:📎 [Acessar documento](https://docs.google.com/document/d/13wkfDSgGlnWveZ8LfTvFapXwPpOjBqb2P9J6917QxQ4/edit?usp=sharing)
- 📬 **Informações de Contato**:  
  - 👤 **Anna Beatriz** - [GitHub](https://github.com/annabeatriz)  
  - 👤 **Erick Silva** - [GitHub](https://github.com/ericksilva)  

  - ✉️ **Erick**: 📩 santoserick0031@gmail.com  
  - ✉️ **Beatriz**: 📩 bia.dias.cardoso720@gmail.com


- 📂 🔗 **[Repositório do Projeto](https://github.com/bea7dias/projetoBD-talentusRh.git)**
