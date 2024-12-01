import java.util.Scanner;

public class Main {
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
}