import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrada: ");
        String sentence = sc.nextLine();
        if(sentence.contains(":-)")){
            System.out.println("divertido");
        } else if(sentence.contains(":-(")){
            System.out.println("chateado");
        } else {
            System.out.println("neutro");
        }
    }
}