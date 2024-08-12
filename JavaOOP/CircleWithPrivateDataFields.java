public class CircleWithPrivateDataFields {
    // The radius of the circle
    private double radius = 1;
    // The number of objects
    private static int numberOfObjects = 0;

    //Constructor
    public CircleWithPrivateDataFields(){
        numberOfObjects++;
    }
    
    //Constructor with argument
    public CircleWithPrivateDataFields(double newRadius){
        radius = newRadius;
        numberOfObjects ++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newradius) {
        radius = newradius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

   public double getArea(){
    return radius * radius * Math.PI;
   }

    
    
}
