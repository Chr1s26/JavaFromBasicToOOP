

public class TestCircleWithException {
    public static void main(String[] args) {
        try {
             circleWithException c1 = new circleWithException(5);
             circleWithException c2 = new circleWithException(-5);
             circleWithException c3 = new circleWithException(0);
            
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of objects created: "+circleWithException.getNumberOfObject());
    }
    
}
