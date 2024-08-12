import java.util.Scanner;
public class ex71smallestelement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers ");
        double[] array = new double[10];
        for(int i = 0; i < array.length; i ++){
        
        array[i] = input.nextDouble();}
        findsmallest(array);

        
    }

    public static void findsmallest(double[] array1){
        
        if(array1.length == 0){
            System.out.println("No argument passed");
        }
        double min = array1[0];
        for(int i = 1; i < array1.length; i++){
            if(array1[i]< min){
                min = array1[i];
            }
        }
        System.out.println("The minimum number is " + min);
       

    }
    
}
