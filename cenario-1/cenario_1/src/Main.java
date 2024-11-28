import entities.Person;

public class Main {
    public static void main(String[] args) {

        Person gabs = new Person("Gabs");
        gabs.spouse(new Person("Joy"));
        Person dante = new Person("Dante", gabs);
        dante.spouse(new Person("Maria"));

        System.out.println(gabs.printFamilyTree());

    }
}