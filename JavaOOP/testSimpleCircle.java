public class testSimpleCircle {
    public static void main(String[] args) {
        
        // Create and object with radius
        circle circle1 = new circle();
        circle circle2 = new circle(25);

        System.out.println("The area of circle1 of radius "+circle1.radius+ 
        "is" + circle1.getArea());
        System.out.println("The area of circle1 of radius "+circle2.radius+ 
        "is" + circle2.getArea());
    }
    
}
