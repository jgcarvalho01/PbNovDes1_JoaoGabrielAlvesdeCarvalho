import entities.Person;

public class Main {
    public static void main(String[] args) {

        Person gabs = new Person("Gabs");
        gabs.spouse(new Person("Joy"));
        Person dante = new Person("Dante", gabs);
        dante.spouse(new Person("Maria"));
        Person abel = new Person("Abel", dante);
        abel.spouse(new Person("Amelia"));
        Person luffy = new Person("Luffy", abel);
        Person makino = new Person("Makino", abel);
        makino.spouse(new Person("Shanks"));

        gabs.printFamilyTree(0);

    }
}