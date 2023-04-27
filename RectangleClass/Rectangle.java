/*Programmer Name: Kyle Riebeling
 * Assignment Start: 6:02 PM 4/26/2023
 * Assignment Completion: 7:16 PM 4/26/2023
 * Total Hours of Assignment: ~ 1 hour
 * Comments: 
 */
package RectangleClass;

public class Rectangle{
    private float length;
    private float width;

    public Rectangle(){
        length = 1;
        width =1;
    }

    public void setLength(float s){length = s;}

    public void setWidth(float s){width = s;}

    public float getLength(){return length;}

    public float getWidth(){return width;}

    public float perimeter(){return ((2*length) + (2*width));} 

    public float area(){return (length*width);}

}