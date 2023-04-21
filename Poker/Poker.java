package Poker;
/*Programmer Name: Kyle Riebeling
 * Assignment Start: 4:05 PM 4/21/2023
 * Assignment Completion: 7:16 PM 4/21/2023
 * Total Hours of Assignment: ~ 3 hours
 * Comments: This was a fun project. Its also very useful because I happen to have a 
 *           "card game" assignment due in my c++ class, and we were given permission to
 *           simply modify a game project from another class.
 */

public class Poker {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order
        Card[] playersHand = new Card[5];

        // print all 52 Cards in the order in which they are dealt
        for (int i = 0; i < 5; i++) {
            playersHand[i] = myDeckOfCards.dealCard();
            System.out.println(playersHand[i].toString());
        }
        System.out.printf("%s\n", myDeckOfCards.evaluateHand(playersHand));
    
        System.out.printf("Thank you for using the Card Shuffling and Dealing application.\nTime of calculation is %s", date);
        System.exit(0);
    } 
} 