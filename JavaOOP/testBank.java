public class testBank{
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("Bank interest rate is "+b.getInterestRate());

        SCB scb = new SCB();
        System.out.println("SCB interest rate is "+scb.getInterestRate());

        TTB ttb = new TTB();
        System.out.println("TTb interest rate is "+ttb.getInterestRate());
    }
    
}
