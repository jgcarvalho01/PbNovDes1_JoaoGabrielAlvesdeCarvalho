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
        System.out.println("Number of funny: " + count_funny);

        position = 0;
        while ((position = sentence.indexOf(":-(", position)) != -1) {
            count_sad++;
            position += ":-(".length();
        }
        System.out.println("Number of sad: " + count_sad);

//        if(sentence.contains(":-)")){
//            System.out.println("divertido");
//        } else if(sentence.contains(":-(")){
//            System.out.println("chateado");
//        } else {
//            System.out.println("neutro");
//        }
    }
}