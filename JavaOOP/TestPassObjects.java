

public class TestPassObjects {
    public static void main(String[] args) {
        //Create a circle with radius 1 
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

        //Print areas for radius 1,2,3,4 and 5
        int n= 5;
        printAreas(myCircle, n);
    }
    
    public static void printAreas(CircleWithPrivateDataFields c, int times){
        System.out.println("Radius\t\tArea");
        while(times >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius()+1);
            times--;
        }
    }
    
}
