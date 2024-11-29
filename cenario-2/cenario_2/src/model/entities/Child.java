package model.entities;

public class Child extends Person{

    private Adult responsible;

    public Child(String name, int age){
        super(name, age);
    }

    // Constructor of the Child class that initializes the name, age, and responsible adult for the child
    public Child(String name, int age, Adult responsible) {
        super(name, age);
        this.responsible = responsible;
    }

    // Method that returns the responsible adult for the child
    public Adult getResponsible() {
        return responsible;
    }

}
