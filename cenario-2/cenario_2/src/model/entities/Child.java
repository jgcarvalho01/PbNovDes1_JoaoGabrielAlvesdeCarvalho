package model.entities;

public class Child extends Person{

    private Adult responsible;

    public Child(String name, int age){
        super(name, age);
    }

    public Child(String name, int age, Adult responsible) {
        super(name, age);
        this.responsible = responsible;
    }

    public Adult getResponsible() {
        return responsible;
    }

}
