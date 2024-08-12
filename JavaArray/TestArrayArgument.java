public class TestArrayArgument {
    public static void main(String[] args) {
        int x = 1;
        int[] y ={1,2,3,4};

        //call test method
        test(x,y);
        System.out.println("Value of x after method "+x);
        System.out.println("Value of y[0] after calling method "+y[0]);
        
    }

    //create a test method
    public static void test(int number, int[] numbers){
        number = 2;
        numbers[0] = 5;//assign a new values to index 0
    }
    
}
