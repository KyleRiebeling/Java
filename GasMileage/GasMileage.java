package GasMileage;
/*Programmer Name: Kyle Riebeling
 * Assignment Start: 4:05 PM 3/1/2023
 * Assignment Completion: 11:16 AM 2/20/2023
 * Total Hours of Assignment: ~ 1 hour
 * Comments: For some reason my IDE created the .class file in some weird folder for this program.
 *           I didn't have the same problem with the first assignment and everything online says
 *           that visual studio code should just automatically create the file in the same folder 
 *           if you have the extensions that I installed, but I was able to just drag the .class file
 *           over and is seems to still work fine, so hopefully it works fine on your end too.
 */

 import java.util.Scanner; 

 public class GasMileage
 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        java.util.Date date = new java.util.Date();

        float totalMiles = 0;
        float totalGallons = 0;
        float totalMPG = 0;
        int trips = 0;

        System.out.println("Enter the amount of trips taken:");
        trips = input.nextInt();
        
        for (int i = 0; i < trips; i++){
            System.out.printf("Enter the amount of miles driven for trip %d: \n", i + 1);
            float tripMiles = input.nextFloat();

            System.out.printf("Enter the amount of gallons used for trip %d: \n", i + 1);
            float tripGallons = input.nextFloat();

            float tripMPG = tripMiles/tripGallons;
            System.out.printf(java.util.Locale.US,"The MPG for trip %d is: %.2f\n", i + 1, tripMPG);

            totalMiles += tripMiles;
            totalGallons += tripGallons;
        }

        totalMPG = totalMiles/totalGallons;
        System.out.printf(java.util.Locale.US,"Total MPG across all trips is: %.2f\n", totalMPG);

        System.out.printf("Thank you for using the Gas Mileage application.\nTime of calculation is %s", date);
        input.close();
        System.exit(0);
    }

 }