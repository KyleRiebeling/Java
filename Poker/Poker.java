package Poker;



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