package DCA;
/*Programmer Name: Kyle Riebeling
 * Assignment Start: 10:35 AM 2/20/2023
 * Assignment Completion: 11:16 AM 2/20/2023
 * Total Hours of Assignment: ~ 1 hour
 * Comments: I really like how much more dynamic the outputs are for Java compated to C++.
 *           The only thing I really struggled with on this assignment was not realising I needed
 *           to declare a new Scanner object for input to work.
 */

 import java.util.Scanner;
  

 public class DCA
 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        java.util.Date date = new java.util.Date();

        System.out.printf("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double diameter = 2.0 * radius;
        double circumference = 2.0 * 3.14159 * radius;
        double area = 3.14159 * radius * radius;

        System.out.printf("The Diameter is %f, the Circumference is %f, and the Area is %f.\n", diameter, circumference, area);

        System.out.printf("Thank you for using the DCA of a Circle application.\nTime of calculation is %s", date);

        input.close();
        System.exit(0);
    }



 }