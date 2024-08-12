import java.util.Scanner;
public class ex42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length ");
        double length = input.nextDouble();
        double side =  2 * length * Math.sin(Math.PI/5);
        double area = (5 * Math.pow(side,2))/(4*Math.tan(Math.PI/5));
        
        System.out.println(area);

    }
    
}
