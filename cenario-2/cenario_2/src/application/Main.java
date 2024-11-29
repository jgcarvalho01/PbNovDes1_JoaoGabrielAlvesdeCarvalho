package application;

import model.entities.Adult;
import model.entities.Child;
import model.entities.FerrisWheel;
import model.entities.Gondola;

public class Main {
    public static void main(String[] args) {
        FerrisWheel ferrisWheel = new FerrisWheel();
        Adult gabs = new Adult("Gabs", 25);
        Child dante = new Child("Dante", 5, gabs);

        System.out.println(gabs);
        System.out.println(dante);
        System.out.println(dante.getResponsible());

        ferrisWheel.status();

    }
}