public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        CircleWithPrivateDataFields mycircle = new CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle with "+ mycircle.getRadius()+ " is "+ mycircle.getArea());
        mycircle.setRadius(mycircle.getRadius()*1.1);
        System.out.println("The area of the circle with "+ mycircle.getRadius()+ " is "+ mycircle.getArea());
        System.out.println("the number of objects created are "+CircleWithPrivateDataFields.getNumberOfObjects());
    }
    
}
