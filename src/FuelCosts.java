import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gasInTank;
        double fuelEfficiency;
        double gasPrice;
        double gasRange;
        double range100;
        String trash;

        System.out.println("Enter the current amount of gas in your car in gallons.");

        if(in.hasNextDouble()) {
            gasInTank = in.nextDouble();
            in.nextLine();

            System.out.println("Enter the fuel efficiency of your car in miles per gallon");
            if(in.hasNextDouble()){
                fuelEfficiency = in.nextDouble();
                in.nextLine();

                System.out.println("Enter the current price of gas per gallon");
                if(in.hasNextDouble()){
                    gasPrice = in.nextDouble();
                    in.nextLine();

                    range100 = (100 / fuelEfficiency) * gasPrice;
                    gasRange = gasInTank * fuelEfficiency;

                    System.out.printf("The distance driveable with current gas %.2f%n", gasRange);
                    System.out.printf("The price of driving 100 miles %.2f%n", range100);
                }else{
                    trash = in.nextLine();
                    System.out.println("You entered the invalid gas price: " + trash);
                }
            }else{
                trash = in.nextLine();
                System.out.println("You entered the invalid miles per gallon: " + trash);
            }
        }else{
            trash = in.nextLine();
            System.out.println("You entered an invalid gallon amount: " + trash);
        }
    }
}
