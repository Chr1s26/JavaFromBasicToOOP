public class stockex92 {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public stockex92(){

    }
    public stockex92(String newSymbol, String newName, double newPreviousClosingPrice){
        previousClosingPrice = newPreviousClosingPrice;
        name = newName;
        symbol = newSymbol;
    }
    


    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    public double getCurrentPrice() {
        return currentPrice;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public double getChangePercent(){
        return ((currentPrice-previousClosingPrice) / previousClosingPrice) * 100;
    }
    
}
