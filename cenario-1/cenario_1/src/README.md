# **Projeto Árvore Genealógica**

## **Descrição do Projeto**
Este projeto tem como objetivo criar e exibir uma árvore genealógica recursiva, contendo informações como:
- Nome da pessoa.
- Seu cônjuge (se casado).
- Seus filhos e respectivos cônjuges e filhos.

A árvore genealógica é exibida na tela utilizando **recursão**, permitindo adicionar novas pessoas sem limites.

---

## **Detalhes sobre a Stack**

- **Linguagem**: Java versão 8.
- **Paradigma**: Programação Orientada a Objetos (POO).
- **Persistência**: Não há persistência de dados, todas as informações são mantidas em memória.
- **IDE recomendada**: IntelliJ IDEA, Eclipse, ou outra de sua preferência.

---

## **Detalhes sobre as Operações**

### Funcionalidades principais:
1. **Adicionar cônjuge**:
    - O método `spouse(Person spouse)` adiciona um cônjuge a uma pessoa.
2. **Adicionar filhos**:
    - O método `addChild(Person child)` adiciona filhos a uma pessoa.
3. **Exibir árvore genealógica**:
    - O método `printFamilyTree(int indentLevel)` imprime a árvore genealógica recursivamente.

### Regras do funcionamento:
- Uma pessoa pode ter zero ou mais filhos.
- Um cônjuge é vinculado de forma bidirecional (se A está casado com B, B também está casado com A).
- A árvore é exibida com indentação para facilitar a leitura da hierarquia.

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
- Certifique-se de evitar adicionar um cônjuge a uma pessoa já casada, para não causar inconsistências (o método atual não trata isso explicitamente, mas pode ser implementado).
- Teste as entradas antes de rodar o programa completo.
- As informações são armazenadas na memória, então serão perdidas ao fechar a aplicação.

---
## **Exemplo de Entrada de Dados**
Abaixo está um exemplo de código no `Main.java` para testar o funcionamento:
   ```java
       public static void main(String[] args) {

        Person lily = new Person("Lily");
        lily.spouse(new Person("Wilhelm"));
        // Patriarch and matriarch
        Person opa = new Person("Opa", lily);
        opa.spouse(new Person("Oma"));
        // Children of Oma and Opa
        Person reinhold = new Person("Reinhold", opa);
        Person wilma = new Person("Wilma", opa);
        Person sigrid = new Person("Sigrid", opa);
        // Children and spouse of Reinhold
        reinhold.spouse(new Person("Sonia"));
        Person christian = new Person("Christian", reinhold);
        Person gabrielle = new Person("Gabrielle", reinhold);
        Person sabine = new Person("Sabine", reinhold);
        // Children and spouse of Wilma
        wilma.spouse(new Person("Rodolfo"));
        Person ricardo = new Person("Ricardo", wilma);
        Person rodrigo = new Person("Rodrigo", wilma);
        // Ricardo and spouse
        ricardo.spouse(new Person("Debora"));
        // Children and spouse of Christian
        christian.spouse(new Person("Monica"));
        Person oscar = new Person("Oscar", christian);
        Person lorena = new Person("Lorena", christian);
        // Children and spouse of Sigrid
        sigrid.spouse(new Person("Peter"));
        Person martin = new Person("Martin", sigrid);
        Person thomas = new Person("Thomas", sigrid);
        Person claudia = new Person("Claudia", sigrid);
        martin.spouse(new Person("Carla"));
        martin.addChild(new Person("Nicolas"));
        lily.printFamilyTree(0);

    }
```
---

## **Exemplo de Saída Esperada**
Ao rodar o exemplo acima, a saída será:
   ```bash
   Lily -- Married to: Wilhelm -- Children:
	Opa -- Married to: Oma -- Children:
		Reinhold -- Married to: Sonia -- Children:
			Christian -- Married to: Monica -- Children:
				Oscar -- Single
				Lorena -- Single
			Gabrielle -- Single
			Sabine -- Single
		Wilma -- Married to: Rodolfo -- Children:
			Ricardo -- Married to: Debora
			Rodrigo -- Single
		Sigrid -- Married to: Peter -- Children:
			Martin -- Married to: Carla -- Children:
				Nicolas -- Single
			Thomas -- Single
			Claudia -- Single


