package model.entities;

public class FerrisWheel {

    private static final int MAX_GONDOLAS = 18;
    private Gondola[] gondolas = new Gondola[MAX_GONDOLAS];

    // Constructor that initializes the gondolas, creating a new gondola for each index up to the maximum limit MAX_GONDOLAS
    public FerrisWheel() {
        for (int i = 0; i < MAX_GONDOLAS; i++) {
            gondolas[i] = new Gondola(i+1);
        }
    }

    // Method to display the gondolas and their respective passengers
    public void status(){
        System.out.println("* Gondola Status");
        System.out.println("* --------------------");
        for(Gondola gondola: gondolas){
            System.out.println(gondola);
        }
    }

}
