public class employee {


    String name;
    int age;
    double salary;

    // Constructor without arguments

    employee (){

    }

    employee(String newName, int newAge, double newSalary){
        name = newName;
        age = newAge;
        salary = newSalary;
    }
    
    //Return the name of the employee
    
    String getName(){
        return name;
    }
    
    double getsalary(){
        return salary;
    }

    double getIncrement(){
       
        return  salary + salary * 0.05;
    }


}




