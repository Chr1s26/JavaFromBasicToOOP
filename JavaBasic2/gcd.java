import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer :");
        int first = input.nextInt();
        System.out.println("Enter second integer ");
        int second = input.nextInt();
        System.out.println("The greatest gcd is "+gcd1(first,second));
    }
    public static int gcd1(int num1, int num2){
        if (num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int x =0;

        for (int i = 1; i <=num1; i++){
            if (num1 % i == 0 && num2 % i == 0){
                x = i;
            }
        }
          return x;

    }
    
}
