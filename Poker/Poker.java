package Poker;



public class Poker {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order
        Card[] playersHand = new Card[5];
        Card[] testHand = new Card[5];
        // print all 52 Cards in the order in which they are dealt
        for (int i = 0; i < 5; i++) {
            playersHand[i] = myDeckOfCards.dealCard();
            System.out.println(playersHand[i].toString());
        }

        testHand[0] = new Card("King", "Heart");
        testHand[1] = new Card("King", "Spades");
        testHand[2] = new Card("King", "Diamonds");
        testHand[3] = new Card("King", "Heart");
        testHand[4] = new Card("Ten", "Clubs");
        System.out.printf("%s", myDeckOfCards.evaluateHand(testHand));
    } 
} 