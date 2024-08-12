import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String name = input.nextLine();
        int length = name.length();
        String lower = name.toLowerCase();
        int left = 0;
        int right = name.length()-1;
        boolean isPalindrome = true;
        for (int i = 0; i< length; i++ ){
         if (lower.charAt(left) != lower.charAt(right)){
            isPalindrome = false;
         }
        left ++;
        right --;
            
            
        }
        if (isPalindrome){
            System.out.println("It is palindrome");
        } 
        else{
            System.out.println("It is not palindrome");
        }


    }
    
}
