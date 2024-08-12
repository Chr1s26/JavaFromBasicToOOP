//Superclass
public class Bicycle {
    //Data fields
    private int gear;
    private int speed;

    //Constructor 
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    //Apply brake 
    public void applyBrake(int decrement){
        speed -= decrement;
    }

    //speed up
    public void speedup(int increment){
        speed += increment;
    }

    //print the details of bicycle
    public String toString(){
        return(" No of gears are "+ gear + "\n" + " speed of the bicycle is "+speed);  
    }
    

    
}
