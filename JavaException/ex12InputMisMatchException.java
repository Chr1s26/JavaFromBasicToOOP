import java.util.InputMismatchException;
import java.util.Scanner;
public class ex12InputMisMatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        
        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = input.nextInt();
                
                System.out.print("Enter the second integer: ");
                num2 = input.nextInt();
                
                sum = num1 + num2;
                System.out.println("Sum: " + sum);
                break; // Exit the loop if input and calculation are successful
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers.");
                input.next(); // Clear the invalid input from the scanner
            }
        }
        
        input.close();
    }
}
