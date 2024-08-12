import java.util.Scanner;


public class consonant {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.println("Enter ");
     char a = input.next().charAt(0);
    
        
        if (Character.isDigit(a)){
            System.out.println("inva");
        }
        else{
            System.out.println("inval");
        }
        switch(Character.toLowerCase(a)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':System.out.println("vowel");break;
            default :System.out.println("COnsonnant");
       
        
        
    
     }

    }
    
}
