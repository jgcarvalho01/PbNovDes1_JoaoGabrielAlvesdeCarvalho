package model.entities;

import java.util.Arrays;

public class FerrisWheel {

    private static final int MAX_GONDOLAS = 18;
    private Gondola[] gondolas = new Gondola[MAX_GONDOLAS];

    public FerrisWheel() {
        for (int i = 0; i < MAX_GONDOLAS; i++) {
            gondolas[i] = new Gondola(i+1);
        }
    }

    private boolean isPersonOnBoard(Person person) {
        for(Gondola gondola : gondolas) {
            if(gondola.hasPassenger(person)) {
                return true;
            }
        }
        return false;
    }

    public void board(int number, Person... passengers) {

        if(number < 1 || number > MAX_GONDOLAS) {
            System.out.println("ERROR Gondola number out of range!");
            return;
        }

        Gondola gondola = gondolas[number - 1];

        for(Person passenger : passengers) {
            if(passenger instanceof Child child && child.getAge() < 12){
                Adult responsible = child.getResponsible();
                boolean hasResponsible = Arrays.asList(passengers).contains(responsible);
                if(responsible == null || !hasResponsible){
                    System.out.printf("ERROR: %s is under 12 and the father is not present%n", child.getName());
                    return;
                }
            }
        }

        if(!gondola.boardPassengers(passengers)) {
            System.out.println("ERROR: Gondola is already full!");
        }

    }

    public void status(){
        System.out.println("* Gondola Status");
        System.out.println("* --------------------");
        for(Gondola gondola: gondolas){
            System.out.println(gondola);
        }
    }

}
