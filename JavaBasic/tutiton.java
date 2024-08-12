public class tutiton {
    public static void main(String[] args) {


    
        double firstTuition = 10000.0;
        double nextTuition = 2 * firstTuition;
        double tuition = firstTuition;
        int years = 0;

        while (tuition < nextTuition) {
            tuition = tuition + (tuition * 0.07); 
            years++;
        }

        System.out.println("Tuition will be doubled in " + years + " years.");
        System.out.printf("Tuition will be $ %-2.2f in %-2d years" ,tuition ,years);
    }
    
}
