import entities.Person;

public class Main {
    public static void main(String[] args) {

        Person gabs = new Person("Gabs");
        Person dante = new Person("Dante", gabs);

        System.out.println(gabs);
        System.out.println(dante);

    }
}