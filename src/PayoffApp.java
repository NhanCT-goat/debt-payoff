import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);



        double[] aprs = new double[100]; // Assuming a maximum of 100 debts
    
        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // add the apr to the arraylist

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }
         //sort arraylist
         //print aprs 
         
    } catch (Exception e) {
        System.err.println("Error occurred while processing input: " + e.getMessage());
    }
}
}
