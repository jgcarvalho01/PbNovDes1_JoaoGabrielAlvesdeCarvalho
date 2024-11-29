package model.entities;

public class FerrisWheel {

    private Gondola[] gondolas = new Gondola[18];

    public FerrisWheel() {
        for (int i = 0; i < 18; i++) {
            gondolas[i] = new Gondola(i+1);
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
