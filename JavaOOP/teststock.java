public class teststock {
    public static void main(String[] args) {
        stockex92 object1 = new stockex92("ORCL","Oracle Corporation",34.5);
        object1.setCurrentPrice(34.35);

        System.out.println("The price change percentage is "+ object1.getChangePercent());
        
    }
    
}
