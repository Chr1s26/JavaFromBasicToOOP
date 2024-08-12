public class TestReturnGrade {
    public static void main(String[] args) {
       
        System.out.print("The grade is ");
        char grate =  printGrade(95.5);
        System.out.println(grate);
    }
    //This is my printGrade method to print grades of students
    
    public static char printGrade(double score){
        if (score >= 90 ){
           return 'A';
        }
        else if (score >= 80){
            return 'B';
        }
        else if (score >= 70){
            return 'C';
        }
        else if (score >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
        
    }
    
}
