public class TestMAx {
    //Main method
    public static void main(String[] args) {
        int i = 2;
        int j = 5;
        int k = max(i,j);
        int l = min(i,j);
        System.out.println("The max of "+i  +" and "+j +" is "+k);
        System.out.println("The min of "+i  +" and "+j +" is "+l);
        
    }
    //This is my max method:It return max of two values

    public static int max(int num1, int num2){

        int result;
        if (num1 > num2){
            result = num1;
        }
        else{
            result = num2;
        }
        return result;
    }
    public static int min(int num1,int num2){
        int result;
        if (num1 < num2){
            result = num1;
        }
        else{
            result = num2;
        }
        return result;
    }

}
