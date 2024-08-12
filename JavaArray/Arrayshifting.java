import java.util.Scanner;
public class Arrayshifting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] mylist = new double[6];

        for (int i = 0; i < mylist.length; i++){
            mylist[i] = input.nextDouble();
        }
        for (int i = 0; i < mylist.length; i++){
            System.out.println(" "+mylist[i]);
        }
        double temp = mylist[0];
        for (int i = 1; i < mylist.length; i++){
            mylist[i-1] = mylist[i];
        }
        mylist[mylist.length-1] = temp;

        for (int i = 0; i < mylist.length; i++){
            System.out.println(mylist[i]);
        }
        
        
        
        
    }
    
}
