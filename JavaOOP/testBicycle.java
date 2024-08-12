public class testBicycle {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
        mb.applyBrake(7);
        System.out.println(mb.toString());
    }
    
}
