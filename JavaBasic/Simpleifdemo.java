import java.util.Scanner;
public class Simpleifdemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0)
           System.out.println("HiFIve");

        if(number % 2 == 0)
           System.out.println("Hieven");

    }
    
}
