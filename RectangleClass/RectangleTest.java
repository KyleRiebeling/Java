/*Programmer Name: Kyle Riebeling
 * Assignment Start: 6:02 PM 4/26/2023
 * Assignment Completion: 7:16 PM 4/26/2023
 * Total Hours of Assignment: ~ 1 hour
 * Comments: 
 */

package RectangleClass;

import java.util.Scanner; 

public class RectangleTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        java.util.Date date = new java.util.Date();

        Rectangle rect = new Rectangle();
        float length = 0;
        float width = 0;

        System.out.print("Enter rectangle length: ");
        length = input.nextFloat();

        System.out.print("Enter rectangle width: ");
        width = input.nextFloat();

        rect.setLength(length);
        rect.setWidth(width);

        System.out.printf("The rectangle with length %.2f and width %.2f has the area %.2f and the perimeter %.2f\n", length,width,rect.area(), rect.perimeter());

        System.out.printf("Thank you for using the Gas Mileage application.\nTime of calculation is %s\n", date);
        input.close();
        System.exit(0);
    }
}
