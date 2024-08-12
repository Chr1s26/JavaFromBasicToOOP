public class testrectangle {
    public static void main(String[] args) {
        rectangleex91 object1 = new rectangleex91(4,40);
        rectangleex91 object2 = new rectangleex91(3.5,35.9);

        System.out.println("The width of rectangle1 is "+object1.width );
        System.out.println("The height of rectangle1 is "+object1.height );
        System.out.println("The perimeter of rectangle1 is "+object1.getPerimeter() );
        System.out.println("The area of rectangle1 is "+object1.getarea() );
        System.out.println("The width of rectangle2 is "+object2.width );
        System.out.println("The height of rectangle2 is "+object2.height );
        System.out.println("The perimeter of rectangle2 is "+object1.getPerimeter() );
        System.out.println("The area of rectangle2 is "+object1.getarea() );
    }
    
}
