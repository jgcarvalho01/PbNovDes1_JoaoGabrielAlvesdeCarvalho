package model.entities;

public class Gondola {

    private int number;
    private Person seat1;
    private Person seat2;

    public Gondola(int number) {
        this.number = number;
    }

    public boolean boardPassengers(Person... passengers){
        for(Person passenger : passengers){
            if(seat1 == null){
                seat1 = passenger;
            } else if(seat2 == null){
                seat2 = passenger;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean hasPassenger(Person... passenger) {
        return passenger.equals(seat1) || passenger.equals(seat2);
    }

    @Override
    public String toString() {
       if(seat1 != null && seat2 != null){
           return "* "+number+" "+seat1.getName()+" and "+seat2.getName();
       } else if(seat1 != null && seat2 == null){
           return "* "+number+" Only "+seat1.getName();
       } else if(seat1 == null && seat2 != null){
           return "* "+number+" Only "+seat2.getName();
       } else if(seat1 == null && seat2 == null){
           return "* "+number+ " (empty)";
       }
       return "* "+number+" (invalid state)";
    }
}
