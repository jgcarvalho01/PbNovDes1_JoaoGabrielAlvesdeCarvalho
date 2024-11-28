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

    public String printFamilyTree(){
        System.out.println("Name: " + name + "-- Married to: " + spouse.name+" -- Children: ");
        if(children.isEmpty()){
            System.out.println("No children found");
        } else {
            for(Person child : children){
                child.printFamilyTree();
            }
        }
        return "true";
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", spouse=" + spouse +
//                ", children=" + children +
//                '}';
//    }
}
