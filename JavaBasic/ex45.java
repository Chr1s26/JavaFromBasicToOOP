import java.util.Scanner;
public class ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String input = sc.nextLine();
        char major = input.charAt(0);
        char year = input.charAt(1);
        switch(Character.toLowerCase(major)){
            case 'm':
                System.out.print("Mathematics");
                break;
            case 'i':
                System.out.print("Information Technology");
                break;
            case 'c':
                System.out.print("Computer Science");
                break;
            default:
                System.out.print("Invalid input");
        }
        switch(year){
            case '1':
                System.out.print(" Freshman");
                break;
            case '2':
                System.out.print(" Sophomore");
                break;
            case '3':
                System.out.print(" Junior");
                break;
            case '4':
                System.out.print(" Senior");
        }
    
}}
