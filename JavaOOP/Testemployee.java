public class Testemployee {
    public static void main(String[] args) {
        employee employee1 = new employee("Chris" , 21, 100000.0);
        employee employee2 = new employee("John" , 22 , 80000.0);
        employee employee3 = new employee();
        employee3.name = "GG";
        System.out.println("The name of employee1 is "+employee1.name);
        System.out.println("The name of employee2 is "+employee2.name);
        System.out.println("The name of employee3 is "+employee3.name);

        
    }
    
}
