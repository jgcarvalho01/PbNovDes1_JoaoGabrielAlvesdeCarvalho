package application;

import model.entities.Adult;
import model.entities.Child;
import model.entities.FerrisWheel;
import model.entities.Gondola;

public class Main {
    public static void main(String[] args) {
        FerrisWheel ferrisWheel = new FerrisWheel();
        Adult gabs = new Adult("Gabs", 25);
        Child dante = new Child("Dante", 15, gabs);
        Adult maria = new Adult("Maria", 22);
        Child james = new Child("James", 5, maria);
        Adult odair = new Adult("Odair", 21);

        ferrisWheel.board(1, gabs, dante);
        ferrisWheel.board(5, maria);
        ferrisWheel.board(8, james);
        ferrisWheel.board(25, odair);

        ferrisWheel.status();


    }
}