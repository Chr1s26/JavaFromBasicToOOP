import java.util.Scanner;
import java.util.Random;
public class ex122ArrayOutofBoundsException {
    public static void main(String[] args) {
        int[] randomArray = new int[100];
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Fill the array with 100 random integers
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1000); // You can adjust the upper limit as needed
        }

        System.out.print("Enter the index of the array: ");
        try {
            int index = input.nextInt();

            // Check if the index is within bounds
            if (index >= 0 && index < randomArray.length) {
                int value = randomArray[index];
                System.out.println("Element at index " + index + " is: " + value);
            } else {
                System.out.println("Out of Bounds");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid index.");
        } 
        
    }
}
