public class Dog extends Animal { 

    //Data field of dog class
    private String name;

    //Constructor
    Dog(int age, String food, String name){
        super(age,food);
        this.name =name;
    }

    //Name method of Dog class
    public void name(){
        System.out.println("Name of animal is "+name);
    }
    //sound method of dog class
    public void sound(){
        System.out.println("The sound of the animal is barking");
    }


    
}
