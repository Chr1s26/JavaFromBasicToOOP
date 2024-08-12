public class Lion extends Animal{

    private String name;

    Lion(int age, String food, String name ){
        super(age,food);
        this.name = name;

    }
    public void name(){
        System.out.println("Name of animal is "+name);
    }
    //sound method of dog class
    public void sound(){
        System.out.println("The sound of the animal is   Roar ");
    }


    
}
