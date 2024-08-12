import java.util.Scanner;
public class QuotientWithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user for two integer
        System.out.println("Enter two integers: ");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        input.close();

        int result = Quotient(number1,number2);
        System.out.println(number1 + " / "+ number2 +" = "+result);

    }

    public static int Quotient(int number1,int number2){
        if (number2 == 0){
            System.out.println("Diveisor cannot be zero");
            System.exit(1);
        }
        return number1/number2;
    }
    
}
