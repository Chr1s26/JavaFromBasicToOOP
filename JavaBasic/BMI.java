import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kg");
        double weight = input.nextDouble();
        System.out.print("Enter yout height in cm");
        double height = input.nextDouble();
        double heightinmeter = height * 0.01;

        double BMI = weight/(heightinmeter * heightinmeter);
        if (BMI < 18.5){
            System.out.println("Underweight");
        }
        else if (BMI < 25){
            System.out.println("Normal");
        }
        else if (BMI < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
}
    
}
