package entities;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Person spouse;
    private List<Person> children = new ArrayList<Person>();

    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public Person(String name, Person parent) {
        this.name = name;
        parent.children.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getSpouse() {
        return spouse;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void spouse(Person spouse) {
        this.spouse = spouse;
        spouse.spouse = this;
    }

    public void printFamilyTree(int level){
        String indent = "\t".repeat(level);

        if(spouse != null){
            System.out.print(indent + name + " -- Married to: " + spouse.name);
        } else {
            System.out.println(indent + name + " -- Single");
        }

        if(!children.isEmpty()){
            System.out.println(" -- Children: ");
            for(Person child : children){
                child.printFamilyTree(level+1);
            }
        } else if (spouse != null){
            System.out.println();
        }
    }

}
