public class circle2 {
    //data field
    double radius;

    //number of object
    static int numberOfObjects = 0;

    circle2(){
        radius = 1;
        numberOfObjects ++;
    }

    static int getnumberOfObject(){
        return numberOfObjects;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
    
}
