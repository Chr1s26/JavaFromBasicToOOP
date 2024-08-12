import java.util.Scanner;
public class lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first digits");
        int firstdigit = input.nextInt()*9;
        System.out.println("Enter second digits");
        
    int seconddigit = input.nextInt()*9;
    int number1= (int)(Math.random());
    int number2= (int)(Math.random());
    System.out.println("Lottery number is"+ number1 +number2);
        if (number1 == firstdigit && number2 == seconddigit){
          System.out.println("You won the first prize");}
        else if ( number1 == firstdigit ||  number2 == seconddigit){
          System.out.println("You won the third prize");}
        else if (number2 == seconddigit && number1 == firstdigit){
          System.out.println("You won second prize");}
        else{
            System.out.println("You lose");
        }
    
      }}
    
