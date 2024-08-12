import java.util.Scanner;
public class Guessingnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0  and 100");
        System.out.println("Enter your guess : ");
        int number = input.nextInt();
        int random = (int)(Math.random()*101);
        
        while (random != number){
            if (number > random){
                System.out.println("Your guess is too high");
            }
            else if (random > number){
                System.out.println("Your guess is too low ");
            }
            System.out.println("Enter your guess");
            number = input.nextInt();

        }
        System.out.println("Yes, the number is "+random);
        input.close();
    
        
    }
    
}
