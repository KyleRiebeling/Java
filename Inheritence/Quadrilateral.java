/*Programmer Name: Kyle Riebeling
 * Assignment Start: 6:02 PM 4/26/2023
 * Assignment Completion: 7:16 PM 4/26/2023
 * Total Hours of Assignment: ~ 1 hour
 * Comments: 
 */

package Inheritence;
import java.util.Scanner; 


abstract class Quadrilateral{
    
    private Scanner input = new Scanner(System.in);
    protected Point point1;
    protected Point point2;
    protected Point point3;
    protected Point point4;

    protected void setShapeChords(){
        double temp1,temp2;
        System.out.println("Please enter points clockwise, starting with the top left.");
        for (int i = 0; i < 4; i++){
            System.out.printf("Enter point %d x:", i+1);
            temp1 = input.nextDouble();

            System.out.printf("Enter point %d y:", i+1);
            temp2 = input.nextDouble();

            System.out.println(" ");

            switch (i){
                case 0:
                    point1.setChords(temp1, temp2);
                    break;
                case 1:
                    point2.setChords(temp1, temp2);
                    break;
                case 2:
                    point3.setChords(temp1, temp2);
                    break;
                case 3:
                    point4.setChords(temp1, temp2);
                    break;
            }
        }
    }
    
}