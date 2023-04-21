package CrapsGame;
/* Programmer Name: Kyle Riebeling
 * Assignment Start: 10:35 AM 3/9/2023
 * Assignment Completion: 11:45 AM 3/9/2023
 * Total Hours of Assignment: ~ 1 hour
 * Comments: I wasn't sure if the question was asking for a running total of all sales 
 *           or if it was asking for a running total of all individual products, but it seemed
 *           like it was just looking for the running total of all sales.
 */

import java.security.SecureRandom;
import java.util.Scanner;
  

public class CrapsGame {

    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status { CONTINUE, WON, LOST };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;




    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        java.util.Date date = new java.util.Date();
        
        int myPoint = 0;
        int sumOfDice = 0;
        int bankBalance = 1000;
        int amountBet = 0;

        Status gameStatus;


        while (bankBalance > 0){

        do{
            System.out.printf("Enter an amount to Wager between %d and 0:\n", bankBalance);
            amountBet = input.nextInt();
        }while (amountBet > bankBalance || amountBet < 1);

        BettingChatter(amountBet, bankBalance);
        sumOfDice = rollDice();

        switch (sumOfDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                break;
        } 

        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            if (sumOfDice == myPoint){
                gameStatus = Status.WON;
            }
            
            else if (sumOfDice == SEVEN){
                gameStatus = Status.LOST;
            }
        }

        if (gameStatus == Status.WON){
            bankBalance += amountBet;
            System.out.printf("Player wins, new balance is %d\n\n", bankBalance);
            GameWinChatter(); 
        }

        else{
            bankBalance -= amountBet;
            if (bankBalance > 0){  
                System.out.printf("Player loses, new balance is %d\n", bankBalance);
                GameLoseChatter(); 
            }
            else{
                System.out.println("Sorry. You busted!\n");
            }
        }

        }

        System.out.printf("Thank you for using the Casino application.\nTime of calculation is %s", date);
        input.close();
        System.exit(0);
    }


    public static int rollDice(){
        int sum = 0;

        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n",die1, die2, sum);

        return sum;
    }

    public static void BettingChatter(int amountBet, int bankBalance){
        
        int rand = 1 + randomNumbers.nextInt(2);

        if (amountBet >= bankBalance/4){
            switch(rand){
                case 1:
                    System.out.println("Woah! Go big or go home I guess!");
                    break;
                case 2:
                    System.out.println("I'm feeling good about this round too! Bet big, bet big!");
                    break;
                default:
                break;
            }
        }

        else{
            switch(rand){
                case 1:
                    System.out.println("Good luck everyone!");
                    break;
                case 2:
                    System.out.println("Playing it safe. Smart!");
                    break;
                default:
                break;
            }
        }
    }

    public static void GameWinChatter(){
        int rand = 1 + randomNumbers.nextInt(2);

        switch(rand){
            case 1:
                System.out.println("Nice! Keep on rolling!");
                break;
            case 2:
                System.out.println("Keep the rolls going!");
                break;
            default:
            break;
        }
    }

    public static void GameLoseChatter(){
        int rand = 1 + randomNumbers.nextInt(2);

        switch(rand){
            case 1:
                System.out.println("Dang, tough luck.");
                break;
            case 2:
                System.out.println("It's alright, this next round is feeling lucky!");
                break;
            default:
            break;
        }
    }

}
