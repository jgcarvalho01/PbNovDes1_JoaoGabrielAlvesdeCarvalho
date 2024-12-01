# PB Spring Boot - Desafio 1

Este repositório contém a resolução do **Desafio 1** do Programa de Bolsas (PB) com a utilização de **Spring Boot** e outros conceitos essenciais para desenvolvimento em Java. O desafio é dividido em **3 cenários principais** e um **cenário extra**, cada um com uma proposta e implementação distintas.

---

## Estrutura do Repositório

A branch `main` está organizada em **quatro pastas**, cada uma representando um cenário do desafio:

### **1. Cenário 1: Genealogia**
- **Localização:** `cenario-1/cenario_1`
- **Descrição:** 
  - Desenvolve uma árvore genealógica que permite registrar e visualizar, de forma recursiva, os membros de uma família, incluindo cônjuges e filhos.
  - Utiliza Java para trabalhar com os dados diretamente na memória, sem necessidade de banco de dados.
  - Imprime a árvore genealógica de forma estruturada e legível no terminal.


### **2. Cenário 2: Roda Gigante**
- **Localização:** `cenario-2/cenario_2`
- **Descrição:** 
  - Simula a ocupação de assentos em uma roda-gigante, permitindo gerenciar os passageiros.
  - Implementa regras específicas, como permitir somente crianças acompanhadas de um responsável adulto.
  - Inclui tratamento de erros e validações, como proibir a entrada de passageiros duplicados ou exceder a lotação máxima de uma gôndola.


### **3. Cenário 3: Script SQL das Tabelas Pessoa e Gondola**
- **Localização:** `cenario-3/tables_scenario3`
- **Descrição:**
  - Contém o script SQL responsável pela criação das tabelas `Pessoa` e `Gondola`, relacionadas ao Cenário 2.
  - Inclui definições de chave primária, chave estrangeira e relacionamentos entre as tabelas.


### **4. Cenário Extra: Contador de Emojis**
- **Localização:** `cenario-extra/cenario_extra`
- **Descrição:**
  - Um programa em Java que analisa o sentimento de uma mensagem com base na contagem de dois emojis:
    - `:-)` (divertido)
    - `:-(` (chateado)
  - O sentimento pode ser classificado como:
    - **divertido**: mais `:-)` do que `:-(`.
    - **chateado**: mais `:-(` do que `:-)`.
    - **neutro**: quantidades iguais de ambos.


---

## Como Utilizar Este Repositório

### Pré-requisitos
- **Java JDK**: Versão 8 ou superior para executar os cenários 1, 2 e o cenário extra.
- **MySQL**: Para testar o script SQL do cenário 3.
- IDE ou editor de texto (ex.: IntelliJ IDEA, Eclipse, VS Code).

### Execução dos Cenários
1. **Clonar o repositório**:
   ```bash
   git clone <URL_DO_REPOSITORIO>
2. **Acessar a pasta do cenário desejado:**
* Abrir o cenario na sua IDE.
3. **Executar a classe `Main.java`.**
4. **Executar o script SQL (Cenário 3):**
* Importar o arquivo SQL no seu banco de dados MySQL.
* Utilizar ferramentas como MySQL Workbench ou comandos no terminal: 
```SQL
source tables_scenario3.sql;
```
