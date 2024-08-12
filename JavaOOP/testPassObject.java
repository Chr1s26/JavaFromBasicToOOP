import circleClassWithPrivateDataField.circleClassWithPrivateDataField;

public class testPassObject {
    public static void main(String[] args) {
        circleClassWithPrivateDataField myCircle = new circleClassWithPrivateDataField();
        int n = 5;
        printArea(myCircle, n);

        System.out.println("\n"+"Radius is "+ myCircle.getRadius());

    }

    public static void printArea(circleClassWithPrivateDataField c, int times){
        System.out.println("Radius \t\tArea");
        while (times >= 1){
            System.out.println(c.getRadius() +"\t\t" + c.getArea());
            c.setRadius(c.getRadius()+1);
            times --;
        }
    }
    
}
