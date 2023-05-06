/*Programmer Name: Kyle Riebeling
 * Assignment Start: 6:07 PM 5/5/2023
 * Assignment Completion: 8:12 PM 5/5/2023
 * Total Hours of Assignment: ~ 2 hours
 * Comments: 
 */
package Inheritence;

public class Parallelogram extends Quadrilateral {

    public Parallelogram(){
        point1 = new Point();
        point2 = new Point();
        point3 = new Point();
        point4 = new Point();
    }

    public double area(){
        return (point1.getyChord()-point4.getyChord()) * (point2.getxChord()-point1.getxChord());
    }
    
}
