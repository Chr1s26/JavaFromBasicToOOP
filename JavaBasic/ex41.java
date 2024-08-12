import java.util.Scanner;
public class ex41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your decimal number : ");
        int c = input.nextInt();
       /*  String a = input.nextLine();
        int b =Integer.parseInt(a);*/
        String hexastring = Integer.toHexString(c);
        String octalstring = Integer.toOctalString(c);
        String binarystring = Integer.toBinaryString(c);
        System.out.println("Decimal is "+c);
        System.out.println("Hexa is "+hexastring.toUpperCase());
        System.out.println("Octal number is "+octalstring);
        System.out.println("Binary number is "+binarystring);
    
        
    }
    
}
