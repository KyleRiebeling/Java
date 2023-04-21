package CalculatingSales;
/* Programmer Name: Kyle Riebeling
 * Assignment Start: 10:35 AM 3/9/2023
 * Assignment Completion: 11:45 AM 3/9/2023
 * Total Hours of Assignment: ~ 1 hour
 * Comments: I wasn't sure if the question was asking for a running total of all sales 
 *           or if it was asking for a running total of all individual products, but it seemed
 *           like it was just looking for the running total of all sales.
 */

 import java.util.Scanner;
  


public class CalculatingSales {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        java.util.Date date = new java.util.Date();
        int productNum, amountSold;
        float productPrice, totalSales = 0;


        System.out.println("Input the first product number:");
        productNum = input.nextInt();

        while (productNum != 0){
            System.out.println("Input the amount sold: ");
            amountSold = input.nextInt();

            productPrice = switch (productNum) {
                case 1 -> 2.98f;
                case 2 -> 4.5f;
                case 3 -> 9.98f;
                case 4 -> 4.49f;
                case 5 -> 6.87f;
                default -> 0;
            };

            totalSales = totalSales + (productPrice * amountSold);
            System.out.printf("The current running total is: %.2f \n", totalSales);

            do{
            System.out.println("Input the next product number 1-5 or enter 0 to exit: ");
            productNum = input.nextInt();

            if (productNum > 5 || productNum < 0){
                System.out.println("Invalid product number. Please try again.");
            } 
            }while(productNum > 5 || productNum < 0);
        }

        System.out.printf("The ending total sales are: %.2f \n\n", totalSales);

        System.out.printf("Thank you for using the Calculating Sales application.\nTime of calculation is %s", date);
        input.close();
        System.exit(0);
    }

}
