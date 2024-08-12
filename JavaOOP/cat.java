public class cat extends Animal {
    private String name ;

    public cat(int age, String food,String name ){
        super(age,food);
        this.name = name;
    }
    public void printname(){
        System.out.println("The name is "+name);
    }
    public void printsound(){
        System.out.println("The sound is meow");
    }
    @Override
    public String toString() {
        return super.toString()+"cat [name=" + name + "]";
    }
    

    
}
