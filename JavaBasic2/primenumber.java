public class primenumber {
    public static void main(String[] args) {
        int totalprime = 50;
        int numberofLine = 10;
        int number = 2;
        int count = 0;
       
        while (count < totalprime) {
            boolean isprime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                if (count % numberofLine == 0) {
                    System.out.printf("\n");
                } 
                    System.out.printf("%5d", number);
                
                count++;
            }

            number++;

        }   
}
}
