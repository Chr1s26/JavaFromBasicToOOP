import java.util.Scanner;
public class ex43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter : ");
        char letter = input.next().charAt(0);
        char upperletter = Character.toUpperCase(letter);
        if (Character.isLetter(letter)){
        switch (upperletter){
            case 'A' : 
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :System.out.println(letter+" is a vowel");break;
            default : System.out.println(letter+ "is a consonant");break;
            }}
            else{
                System.out.println("Invalid Input");
            }
            input.close();

    }
    
}
