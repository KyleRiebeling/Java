package RollingDice;
/* Programmer Name: Kyle Riebeling
 * Assignment Start: 1:35 PM 3/20/2023
 * Assignment Completion: 3:58 PM 3/20/2023
 * Total Hours of Assignment: ~ 2 hours
 * Comments: I started this project by making a separate method for rolling the dice and having
 *           that return an int that was set to an int in main and used a switch case to add to
 *           the roll data array. Although it worked fine, it was pretty slow, especially on my 
 *           sad little struggling chromebook. I looked in the slides and saw a much better way
 *           to have the loop run, which is how I have it set up now.
 */

import java.security.SecureRandom;

public class RollingDice {

    private static final SecureRandom randomNumbers = new SecureRandom();

    public static void main (String[] args){
        java.util.Date date = new java.util.Date();

        int[] rollData = new int[13];

        for (int roll = 1; roll <=36000000; roll++){
            ++rollData[(1 + randomNumbers.nextInt(6))+ (1 + randomNumbers.nextInt(6))];
        }
        
        System.out.printf("%n%s%10s%n", "Face", "Frequency");

        for (int roll = 2; roll < rollData.length; roll++){
            System.out.printf("%4d%10d%n", roll, rollData[roll]);
        }
        System.out.println();

        System.out.printf("Thank you for using the Dice Rolling application.\nTime of calculation is %s.%n", date);
        System.exit(0);
    }
}
