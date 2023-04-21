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
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order
        Card[] playersHand = new Card[5];

        // print all 52 Cards in the order in which they are dealt
        for (int i = 0; i < 5; i++) {
            playersHand[i] = myDeckOfCards.dealCard();
            System.out.println(playersHand[i].toString());
        }
        System.out.printf("%s", myDeckOfCards.evaluateHand(playersHand));
    } 
} 