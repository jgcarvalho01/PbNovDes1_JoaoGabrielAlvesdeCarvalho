# **Banco de dados: Person e Gondola**

## **Descrição do Projeto**
Este script SQL se refere as classes Person e Gondola do Cenario 2 que se trata de um programa de controle de roda gigante. Nele contem as tabelas:
- Person: Onde contem as informações das pessoas que são de dois tipos: adultos ou crianças.
- Gondola: Se trata das gôndolas da roda gigante, cada gôndola possui dois assentos.

---

## Estrutura das Tabelas

### Tabela: `person`
Tabela que armazena os dados de indivíduos que podem ser passageiros da roda-gigante.

- **Colunas**:
  - `id` (INT): Identificador único da pessoa. **Chave primária**.
  - `name` (VARCHAR): Nome da pessoa. Não pode ser nulo.
  - `age` (INT): Idade da pessoa. Não pode ser nulo.
  - `type` (ENUM): Define o tipo da pessoa:
    - `'Adult'`: Pessoa adulta.
    - `'Child'`: Criança.
  - `responsible_id` (INT): Relacionamento com a pessoa responsável pela criança. **Chave estrangeira** para `person(id)`.

---

### Tabela: `gondola`
Tabela que armazena os dados das gôndolas da roda-gigante.

- **Colunas**:
  - `id` (INT): Identificador único da gôndola. **Chave primária**.
  - `number` (INT): Número único que identifica cada gôndola. Não pode ser nulo e é único.
  - `seat1_id` (INT): Relacionamento com a pessoa sentada no assento 1. **Chave estrangeira** para `person(id)`.
  - `seat2_id` (INT): Relacionamento com a pessoa sentada no assento 2. **Chave estrangeira** para `person(id)`.

---

## Requisitos
- Banco de dados relacional compatível com o SQL padrão (ex.: MySQL ou MariaDB).
- O esquema define relacionamentos utilizando **chaves estrangeiras**:
  - A coluna `responsible_id` na tabela `person` faz referência ao campo `id` da própria tabela.
  - As colunas `seat1_id` e `seat2_id` na tabela `gondola` fazem referência à coluna `id` da tabela `person`.

---

## Script de Criação
Copie o seguinte script para o seu ambiente SQL para criar as tabelas:

```sql
CREATE TABLE person (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    type ENUM('Adult', 'Child') NOT NULL,
    responsible_id INT,
    FOREIGN KEY (responsible_id) REFERENCES person(id)
);

CREATE TABLE gondola (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	number INT NOT NULL UNIQUE,
    seat1_id INT,
    seat2_id INT,
    FOREIGN KEY (seat1_id) REFERENCES person(id),
    FOREIGN KEY (seat2_id) REFERENCES person(id)
);
```
---

## Script de Criação

### Inserção de Pessoas:
```sql
INSERT INTO person (name, age, type) VALUES ('Paulo', 42, 'Adult');
INSERT INTO person (name, age, type, responsible_id) VALUES ('Joao', 5, 'Child', 1); -- New child with Paulo as the father
INSERT INTO person (name, age, type) VALUES ('Maria', 12, 'Child', 1); -- This is Paulo's daughter
INSERT INTO person (name, age, type) VALUES ('Pedro', 13, 'Child');
INSERT INTO person (name, age, type) VALUES ('Henrique', 10, 'Child');
```
### Inserção de Gondolas:
```sql
INSERT INTO gondola (number, seat1_id, seat2_id) VALUES (1, 1, 2); -- Paulo e Joao sentados na gôndola 1
INSERT INTO gondola (number, seat1_id) VALUES (2, 3); -- Maria sentado sozinho na gôndola 2
```

---
## Como Executar o Script
1. Execute o script SQL em um banco de dados.
2. Insira dados de exemplo usando os comandos acima.
3. Faça consultas para verificar o relacionamento entre as tabelas. Exemplos:
* Listar todas as pessoas e seus responsáveis:
```sql
SELECT p1.name AS Person, p2.name AS Responsible
FROM person p1
LEFT JOIN person p2 ON p1.responsible_id = p2.id;
```
* Listar as pessoas sentadas em cada gôndola:
```sql
SELECT g.number AS GondolaNumber, p1.name AS Seat1, p2.name AS Seat2
FROM gondola g
LEFT JOIN person p1 ON g.seat1_id = p1.id
LEFT JOIN person p2 ON g.seat2_id = p2.id;
```

---
## Saída Esperada
### Consulta 1: Pessoas e Responsáveis
```text
+--------+-------------+
| Person | Responsible |
+--------+-------------+
| Paulo  | NULL        |
| Joao   | Paulo       |
| Maria  | Paulo       |
| Pedro  | NULL        |
+--------+-------------+
```
### Consulta 2: Pessoas nas Gôndolas
```text
+---------------+-------+-------+
| GondolaNumber | Seat1 | Seat2 |
+---------------+-------+-------+
|             1 | Joao | Paulo  |
|             2 | Maria| NULL   |
|             3 | Pedro| NULL   |
+---------------+-------+-------+
```

---
## Cuidados Especiais
* Certifique-se de que o banco de dados suporta o tipo ENUM.
* Evite inserir registros duplicados nos assentos das gôndolas. Cada assento deve fazer referência a apenas uma pessoa.
* Verifique os relacionamentos antes de excluir registros para evitar erros de integridade referencial.
