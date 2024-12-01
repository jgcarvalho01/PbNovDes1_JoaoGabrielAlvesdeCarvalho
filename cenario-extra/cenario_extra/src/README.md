# Contador de Emojis: Análise de Sentimentos em Mensagens

## Descrição do Projeto
Este programa analisa o sentimento expresso em uma mensagem com base na contagem de dois emojis:
- `:-)` (divertido)
- `:-(` (chateado)

O sentimento final é classificado como:
- **divertido**: quando há mais `:-)` do que `:-(`.
- **chateado**: quando há mais `:-(` do que `:-)`.
- **neutro**: quando as quantidades de `:-)` e `:-(` são iguais.

---

## Funcionalidades
- Entrada de texto pelo usuário.
- Contagem dos emojis `:-)` e `:-(` presentes na mensagem.
- Determinação do sentimento geral da mensagem.
- Saída com a classificação do sentimento: *divertido*, *chateado* ou *neutro*.

---

## Pré-requisitos
- **Java JDK** (versão 8).
- Editor ou IDE para execução do código como IntelliJ IDEA, Eclipse ou Netbeans.

---

## Como Executar
1. **Clonar o Repositório**:
   Faça o clone do repositório onde este projeto está armazenado.

2. **Abra o projeto no editor ou IDE de sua prefencia**:
   Execute o arquivo `Main.java`.
3. Insira a mensagem na entrada do programa e veja o resultado.

---
## Exemplo de Uso
* Entrada 1:
```text
Entrada: Espero que esteja tudo bem :-)
```
* Saída:
```text
Sentimento: divertido
```
* Entrada 2:
```text
Entrada: Achei o filme muito divertido.
```
* Saída:
```text
Sentimento: neutro
```
* Entrada 3:
```text
Entrada: :-):-(:-):-(
```
* Saída:
```text
Sentimento: neutro
```
* Entrada 4:
```text
Entrada: Sonhei com a prova :-( (vou estudar).
```
* Saída:
```text
Sentimento: chateado
```
---
## Detalhes do Código
### Lógica de Funcionamento:
1. O programa utiliza a classe Scanner para receber uma mensagem digitada pelo usuário.
2. Usa o método `indexOf` para localizar as ocorrências dos emojis `:-)` e `:-(` na mensagem.
3. Armazena as contagens em variáveis separadas (`count_funny` e `count_sad`).
4. Compara as contagens e imprime o sentimento com base nas regras definidas.

### Estrutura do Código:
```java
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrada: ");
        String sentence = sc.nextLine();

        int position = 0;
        int count_funny = 0;
        int count_sad = 0;

        while ((position = sentence.indexOf(":-)", position)) != -1) {
            count_funny++;
            position += ":-)".length();
        }

        position = 0;
        while ((position = sentence.indexOf(":-(", position)) != -1) {
            count_sad++;
            position += ":-(".length();
        }

        System.out.print("Sentimento: ");
        if(count_funny > count_sad) {
            System.out.println("divertido");
        } else if(count_sad > count_funny) {
            System.out.println("chateado");
        } else {
            System.out.println("neutro");
        }
    }
```
---
## Observações
* **Limitação**: O programa diferencia apenas os dois emojis `:-)` e `:-(`. Outros formatos de emojis não são considerados.
* **Dica**: Teste mensagens variadas para explorar o comportamento do programa.