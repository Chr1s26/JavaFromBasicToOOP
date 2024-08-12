public class circle {


    double radius; // this is data field

        //Constructor of the circle class
        
    circle(){
            radius = 1 ;
        }
        //Constructor with argument
    circle(double newRadius){
            radius = newRadius ;
        }
    
    //Return area of the circle 
    double getArea(){
        return radius * radius * Math.PI;
    }

    //Return the perimeter of the circle
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    //Set a new Radius 
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
