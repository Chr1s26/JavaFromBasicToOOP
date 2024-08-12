import java.util.Scanner;
public class SubtractionQuizloop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;//Count the correct question
        int count = 0;//Count the number of question
        long startTime = System.currentTimeMillis();
        String Output = "";
        
        Scanner input = new Scanner(System.in);
        
        while(count < NUMBER_OF_QUESTIONS){
            int number1 = (int)(Math.random()*10);
            int number2 = (int)(Math.random()*10);

          //Make sure the number1 >number2
          if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
          }
          //Prompt the student to answer
          System.out.println("What is "+ number1 +" - "+ number2 +" ?");
          int answer = input.nextInt();

          //Grading
          if (number1 - number2 == answer){
            System.out.println("You are correct !\n");
            correctCount ++;
          }
          else{
            System.out.println("Your answer is wrong.\n"+number1 +"-"+ number2 +"should be"+ (number1 - number2));
          }
          count ++;
          Output += "\n" + number1 + "-"+number2+ "="+answer+
         ((number1 - number2 == answer)?"correct":"wrong");
          

          long endTime = System.currentTimeMillis();
          long testTime = endTime - startTime;
          System.out.println("Correct count is "+correctCount+"Testtime is "+ testTime/1000+" second\n"+Output);

input.close();

        }

    }
    
}
