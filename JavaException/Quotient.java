import java.util.Scanner;
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user for two integer
        System.out.println("Enter two integers: ");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        input.close();
        if(number2 != 0){
        System.out.println(number1 + " / "+ number2 +" = "+(number1/number2));
        }
        else{
            System.out.println("Divisor cannot be zero");
        }

    
}}
