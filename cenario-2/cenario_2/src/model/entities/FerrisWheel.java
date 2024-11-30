package model.entities;

import model.exceptions.ChildWithoutResponsibleException;
import model.exceptions.GondolaFullException;
import model.exceptions.PersonAlreadyOnBoardException;

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
        try {
            for(Person passenger : passengers) {
                if(isPersonOnBoard(passenger)) {
                    throw new PersonAlreadyOnBoardException(passenger.getName()+" is already on a gondola");
                }
            }

            for (Person passenger : passengers) {
                if (passenger instanceof Child child && child.getAge() < 12) {
                    Adult responsible = child.getResponsible();
                    boolean hasResponsible = Arrays.asList(passengers).contains(responsible);
                    if (responsible == null || !hasResponsible) {
                        throw new ChildWithoutResponsibleException(child.getName()
                                +" is under 12 and the father is not present");
                    }
                }
            }

            if (!gondola.boardPassengers(passengers)) {
                throw new GondolaFullException("Gondola "+number+" is already full");
            }
        } catch (PersonAlreadyOnBoardException | ChildWithoutResponsibleException | GondolaFullException e){
            System.out.println("ERROR: " + e.getMessage());
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
