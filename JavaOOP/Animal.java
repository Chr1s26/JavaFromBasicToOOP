public class Animal {
    private int age;
    private String food;

    public Animal(){

    }

    public Animal(int age, String food){
        this.age = age;
        this.food = food;
    }

    //Age method
    public void age(){
        System.out.println("Age:"+age);
    }

    //Food method
    public void food(){
        System.out.println("Eat: "+food);
    }

    @Override
    public String toString() {
        return "Animal [age=" + age + ", food=" + food + "]";
    }
    
    
}
