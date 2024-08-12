import java.util.Scanner;
public class HexToDec {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your hexadecimal ");
            String x = input.next();
            System.out.println("Hexadecimal is "+x);
            System.out.println("Decimal is "+hexa(x));
            
    
        }
        public static int hexa(String x){
            int length = x.length();
            int digitvalue = 0;
            int decimalvalue = 0; 
            for (int i = 0 ; i <= length-1 ; i++){
                char c = x.charAt(i);
              
    
                if (c >='0' && c <= '9'){
                    digitvalue = c - '0' ;
                }
                else if (c >= 'A' && c <= 'F'){
                    digitvalue = 10 + c - 'A';
                }
                else if (c >= 'a' && c <= 'f'){
                    digitvalue = 10 + c - 'a';
                }
                else{
                    System.out.println("Wrong input");
                }
                decimalvalue += digitvalue * Math.pow(16,length-1-i);
            }
            return decimalvalue;
    }
    
}
