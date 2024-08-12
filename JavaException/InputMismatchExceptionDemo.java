import java.util.*;
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        
        do{
            try {
                System.out.println("Enter an integer:");
                int number = input.nextInt();
                System.out.println("The entered number is "+number);
                continueInput = false;
            } catch (InputMismatchException exception) {
                System.out.println("Try again ( "+" Incorrect input )");
                input.nextLine();
                
            }

        }while(continueInput);
        input.close();
    }
    
}
