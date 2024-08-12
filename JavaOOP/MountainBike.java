

public class MountainBike extends Bicycle{
    private int seatHeight;

    MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void seatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }

    //method over rideing
    //@Override
    public String toString(){
        return (super.toString() + "\n Seat height is " + seatHeight);
    }
    
}
