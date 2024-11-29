package model.entities;

public class Gondola {

    private int number;
    private Person seat1;
    private Person seat2;

    public Gondola(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Gondola{" +
                "number=" + number +
                ", seat1=" + seat1 +
                ", seat2=" + seat2 +
                '}';
    }
}
