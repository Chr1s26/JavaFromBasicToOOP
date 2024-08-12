import java.util.Scanner;
public class AdvanceMathlearntool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String output = "";
        long start = System.currentTimeMillis();
    for (int i = 0 ; i < 5 ; i++){
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("What is "+number1+"-"+number2+"?");
        int uranswer = input.nextInt();
        int answer = number1 - number2;
        if (answer == uranswer){
        System.out.println("You are correct");count++;
        }
        else{
            System.out.println("Your answer is wrong");
            System.out.println(number1+"-"+number2+" should be "+answer);
            }

        output +="\n"+ number1+ "-" + number2 + "=" + uranswer +((answer == uranswer)?"correct":"incorrect");
        }
        input.close();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Correct count is "+count+"\nTest time is "+time/1000+"seconds.\n"+output); 
    }
    
}
