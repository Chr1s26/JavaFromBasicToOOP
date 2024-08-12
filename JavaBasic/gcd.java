import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 2 numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("GCd between "+num1+ " and "+ num2 + " is "+greatestcommondivisor(num1, num2));
        
        
    }
    public static int greatestcommondivisor(int i1,int i2){
        if (i1 > i2){
            int temp = i1;
            i1 = i2;
            i2 = temp;
        }
        int a=0;
        for (int x = 1; x <= i1 ; x++){
            if (i1 % x == 0 && i2 % x == 0){
                a = x;
            }
            
        }
        int gcd = a;
        return gcd;
    }
}
