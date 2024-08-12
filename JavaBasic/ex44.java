import java.util.Scanner;
public class ex44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first city ");
        String city1 = input.nextLine();
        System.out.println("Enter the second city ");
        String city2 = input.nextLine();
        System.out.println("Enter the third city ");
        String city3 = input.nextLine();
        String temp;

        // Check city1 and city2
        if (city1.compareTo(city2) > 0) {
            temp = city1;
            city1 = city2;
            city2 = temp;
        }

        // Check city1 and city3
        if (city1.compareTo(city3) > 0) {
            temp = city1;
            city1 = city3;
            city3 = temp;
        }

        // Check city2 and city3
        if (city2.compareTo(city3) > 0) {
            temp = city2;
            city2 = city3;
            city3 = temp;
        }

        // Display cities in ascending order
        System.out.println("The cities in ascending order are: ");
        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city3);



    }
    
}
