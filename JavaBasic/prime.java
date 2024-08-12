import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The first 50 prime numbers" );
        int primenumbers = 50;
        int count = 0;
        int number = 2;
        int numberofline = 10;
        while (count < primenumbers){
            boolean isPrime = true;

            for (int j = 2; j <= number/2; j++){
                if (number % j == 0){
                isPrime = false;
                break;
                
        }}
            if (isPrime){
                if (count % numberofline == 0){
                    System.out.printf(" \n");
                }
                
                System.out.printf("%5d",number);
                count++;
                
                
            
        }
        number ++;

        
    }
    
}
    
}
