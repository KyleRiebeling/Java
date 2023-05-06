/*Programmer Name: Kyle Riebeling
 * Assignment Start: 6:07 PM 5/5/2023
 * Assignment Completion: 8:12 PM 5/5/2023
 * Total Hours of Assignment: ~ 2 hours
 * Comments: 
 */
package Inheritence;

public class Main {
    public static void main(String[] args){
        java.util.Date date = new java.util.Date();

        Rectangle rect = new Rectangle();
        Trapezoid trap = new Trapezoid();
        Square squ = new Square();
        Parallelogram para = new Parallelogram();

        System.out.println("Creating square object!");
        squ.setShapeChords();
        System.out.printf("The area of the square is %.2f.\n\n", squ.area());

        System.out.println("Creating rectangle object!");
        rect.setShapeChords();
        System.out.printf("The area of the rectangle is %.2f.\n\n", rect.area());

        System.out.println("Creating trapezoid object!");
        trap.setShapeChords();
        System.out.printf("The area of the trapezoid is %.2f.\n\n", trap.area());

        System.out.println("Creating parallelogram object!");
        para.setShapeChords();
        System.out.printf("The area of the parallelogram is %.2f.\n\n", para.area());

        System.out.printf("Thank you for using the Quadrilateral application.\nTime of calculation is %s\n", date);
        System.exit(0);
    }
}
