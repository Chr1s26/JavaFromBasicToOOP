import java.util.Scanner;
  public class Weather {
    public static void main(String[] args) {
        final int Number_of_Days = 10;
        final int Number_of_Hours = 24;
        double [][][] data = new double[Number_of_Days][Number_of_Hours][2];

        Scanner input = new Scanner(System.in);
        //Read data using input redirection from file
        for(int k = 0; k < Number_of_Days * Number_of_Hours; k++){
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();

            data[day-1][hour-1][0] = temperature;
            data[day-1][hour-1][1] = humidity;

        }
        input.close();

        //find theh average daily temperature and humidity
        for(int row = 0; row < Number_of_Days; row++){
            double dailytemperatureTotal = 0; double dailyhumidityTotal = 0;
            for (int col = 0; col < Number_of_Hours; col++){
                dailytemperatureTotal += data[row][col][0];
                dailyhumidityTotal += data[row][col][1];
            }

            //Display result
            System.out.println("Day "+ (row + 1) +"'s average temperature is "+ dailytemperatureTotal/Number_of_Hours);
            System.out.println("Day "+ (row + 1) +"'s average humidity is "+dailyhumidityTotal/Number_of_Hours);
        }
    }
    
}
