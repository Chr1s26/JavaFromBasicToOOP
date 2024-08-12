public class circleWithException {
    private double radius;
    public static int numberOfObject = 0;//static means every object you created the same value will be associate
    
    //Constructor
    public circleWithException(){
        this(1.0);
    }

    //constructor with argu
    public circleWithException(double newRadius){
        setRadius(newRadius);
        numberOfObject++;
    }

    public void setRadius(double newRadius) throws IllegalArgumentException{
        if(newRadius > 0){
            radius = newRadius;
        }
        else
           throw new IllegalArgumentException("Radius cannot be negative");
    }

    public double getRadius(){
        return radius;
    }

    public static int getNumberOfObject(){
        return numberOfObject;}
    

    public double getArea(){
        return Math.PI * radius * radius;
    }

    
}
