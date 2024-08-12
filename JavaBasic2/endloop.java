import java.util.Scanner;
public class endloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data;
        int sum = 0;
        do {
            System.out.println("Enter an integer (the input ends if it is 1):");
            data = input.nextInt();
            sum += data;
     }while (data != 1);
     System.out.println(sum);

        
    }
    
}




