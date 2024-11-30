# **Projeto Roda Gigante**

## **Descrição do Projeto**
O projeto simula o funcionamento de uma roda gigante com gôndolas, permitindo o embarque de pessoas com regras específicas. Ele garante que as regras sejam respeitadas, como a necessidade de um responsável para crianças menores de 12 anos e limitações de espaço em cada gôndola.

---

## **Detalhes sobre a Stack**

- **Linguagem**: Java versão 8.
- **IDE recomendada**: IntelliJ IDEA ou Eclipse.
- **Paradigma principal**: Programação Orientada a Objetos (POO).
- **Gestão de erros**: Exceções personalizadas.

---

## **Detalhes sobre as Operações**

### Funcionalidades principais:
1. **Cadastrar pessoas**:
    - **Adultos** e **crianças** com atributos como nome, idade e responsável (para crianças).
2. **Embarcar em uma gôndola**:
    - Cada gôndola tem **dois assentos**.
    - **Regras de embarque**:
        - Crianças menores de 12 anos precisam de um responsável.
        - Uma pessoa não pode estar em mais de uma gôndola ao mesmo tempo.
        - Não é possível exceder o limite de assentos na gôndola.
3. **Exibir o status das gôndolas**:
    - Lista detalhada das gôndolas com as pessoas embarcadas.

### Tratamento de erros:
- **Exceções personalizadas**:
    - **ChildWithoutResponsibleException**: Crianças menores de 12 anos sem responsável.
    - **GondolaFullException**: Gôndola cheia.
    - **PersonAlreadyOnBoardException**: Pessoa já embarcada em outra gôndola.
    - Todas as exceções são tratadas com mensagens claras para o usuário.

---

## **Como Fazer Funcionar**

### **Pré-requisitos**
1. **Java**: Certifique-se de que o Java está instalado:
   ```bash
   java -version
2. **IDE**: Use uma IDE como IntelliJ IDEA, Eclipse ou outra do seu agrado.

### **Passos para execução**
1. CLone o repositório:
    ```bash
    git clone <url-do-repositorio>
2. Abra o projeto na sua IDE e execute classe Main

### **Cuidados Especiais**
- Certifique-se de seguir a lógica das regras para evitar erros.
- Teste as entradas antes de rodar o programa completo.

---
## **Exemplo de Entrada de Dados**
Abaixo está um exemplo de código no `Main.java` para testar o funcionamento:

    ```java
    public static void main(String[] args) { 
	FerrisWheel ferrisWheel = new FerrisWheel(); // Creating a new Ferris wheel 
	Adult paulo = new Adult("Paulo", 42); // Adult named Paulo 
	// Paulo's children 
	Child joao = new Child("Joao", 5, paulo); // New child with Paulo as the father 
	Child maria = new Child("Maria", 12, paulo); // This is Paulo's daughter 
	// Child without defined father 
	Child pedro = new Child("Pedro", 13); 
	Child henrique = new Child("Henrique", 10); 
	/* 
	* Now comes the fun part. A rule has been created in the park: 
	* - Children under 12 years old can only ride accompanied by their father! 
	*/ 
	ferrisWheel.board(2, joao, maria); // ERROR: Joao is under 12 and the father is not present 
	ferrisWheel.board(2, joao, paulo); // OK: Now the father is present 
	ferrisWheel.board(3, maria); // OK: Maria is 12 years old and can ride alone 
	ferrisWheel.board(13, pedro); // OK: Pedro rides alone 
	ferrisWheel.board(16, henrique); // ERROR: Henrique is under 12 and we don't know who the father is (should be Silvio, but he didn't assume responsibility!) 
	ferrisWheel.status();
    }

---
## **Exemplo de Saída Esperada**
Ao rodar o exemplo acima, a saída será:
   ```bash
   ERROR: Joao is under 12 and the father is not  present
ERROR: Henrique is under 12 and the father is not present
* Gondola Status
* --------------------
* 1 (empty)
* 2 Joao and Paulo
* 3 Only Maria
* 4 (empty)
* 5 (empty)
* 6 (empty)
* 7 (empty)
* 8 (empty)
* 9 (empty)
* 10 (empty)
* 11 (empty)
* 12 (empty)
* 13 Only Pedro
* 14 (empty)
* 15 (empty)
* 16 (empty)
* 17 (empty)
* 18 (empty)

