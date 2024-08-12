public class testAnimal {
    public static void main(String[] args) {
        Dog d1 = new Dog(3,"Meat","Shepetd");
        d1.name();
        d1.sound();
        d1.age();
        d1.food();


        Lion d2 = new Lion(5,"Meat","KingOfJungle");
        d2.name();
        d2.sound();
        d2.age();
        d2.food();

        cat d3 = new cat(15, "Fish" , "Hsu");
        d3.printname();
        d3.age();
        d3.printsound();
        d3.food();

       System.out.println(d3.toString());
    }
       

    
}
