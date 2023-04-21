package Poker;
import java.security.SecureRandom;

public class DeckOfCards {
    // random number generator
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52; // constant # of Cards

    private Card[] deck = new Card[NUMBER_OF_CARDS]; // Card references
    private int currentCard = 0; // index of next Card to be dealt (0-51)

    // constructor fills deck of Cards
    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; 
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; 

        // populate deck with Card objects 
        for (int count = 0; count < deck.length; count++) { 
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
 
    } 

    // shuffle deck of Cards with one-pass algorithm
    public void shuffle() {
        // next call to method dealCard should start at deck[0] again
        currentCard = 0; 

        // for each Card, pick another random Card (0-51) and swap them
        for (int first = 0; first < deck.length; first++) {
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current Card with randomly selected Card
            Card temp = deck[first]; 
            deck[first] = deck[second];
            deck[second] = temp;
        } 
    } 

    // deal one Card
    public Card dealCard() {
        // determine whether Cards remain to be dealt
        if (currentCard < deck.length) {
            return deck[currentCard++]; // return current Card in array
        } 
        else {
            return null; // return null to indicate that all Cards were dealt
        } 
    }

    public String evaluateHand(Card[] hand){

        int[] suitsFound = new int[5];
        int[] facesFound = new int[14];

        for (int i = 0; i < 5; i++){
            switch (hand[i].getSuit()){
                case "Hearts":
                    suitsFound[0]++;
                    break;
                case "Clubs":
                    suitsFound[1]++;
                    break;
                case "Spades":
                    suitsFound[2]++;
                    break;
                case "Diamonds":
                    suitsFound[3]++;
                    break;
                default:
                    suitsFound[4]++;
                    break;
            }
            switch (hand[i].getFace()){
                case "Ace":
                    facesFound[0]++;
                    break;
                case "Deuce":
                    facesFound[1]++;
                    break;
                case "Three":
                    facesFound[2]++;
                    break;
                case "Four":
                    facesFound[3]++;
                    break; 
                case "Five":
                    facesFound[4]++;
                    break;
                case "Six":
                    facesFound[5]++;
                    break;
                case "Seven":
                    facesFound[6]++;
                    break;
                case "Eight":
                    facesFound[7]++;
                    break;
                case "Nine":
                    facesFound[8]++;
                    break;
                case "Ten":
                    facesFound[9]++;
                    break;
                case "Jack":
                    facesFound[10]++;
                    break;
                case "Queen":
                    facesFound[11]++;
                    break;
                case "King":
                    facesFound[12]++;
                    break;
                default:
                    facesFound[13]++;
                    break;
            }
        }

        if (facesFound[13] != 0 || suitsFound[4] != 0){
            return "ERROR";
        }

        if (fullHouse(facesFound)){
            return "Full house!";
        }

        if (straight(facesFound)){
            return "Straight!";
        }

        if (flush(suitsFound)){
            return "Flush!";
        }

        if (fourOfAKind(facesFound)){
            return "Four of a kind!";
        }

        if (threeOfAKind(facesFound)){
            return "Three of a kind";
        }

        if (twoPairs(facesFound)){
            return "Two pairs";
        }

        if (pair(facesFound)){
            return "One pair";
        }
        
        return "Nothing";
    }

    private boolean fullHouse(int[] f){
        boolean pair3 = false;
        boolean pair2 = false;
        for (int i = 0; i < f.length; i++){
            if (f[i] == 2){
                pair2 = true;
            }
            if (f[i] == 3){
                pair3 = true;
            }
            if (pair2 && pair3){
                return true;
            }
        }
        return false;
    }

    private boolean straight(int[] f){
        int counter = 0;
        for (int i = 0; i < f.length; i++){
            if (f[i] == 1){
                counter++;
            }
            else{
                counter = 0;
            }
            if (counter == 5){
                return true;
            }
        }
        return false;
    }

    private boolean flush(int[] s){
        for (int i = 0; i < s.length; i++){
            if (s[i] == 5){
                return true;
            }
        }
        return false;
    }

    private boolean fourOfAKind(int[] f){
        for (int i = 0; i < f.length; i++){
            if (f[i] == 4){
                return true;
            }
        }
        return false;
    }

    private boolean threeOfAKind(int[] f){
        for (int i = 0; i < f.length; i++){
            if (f[i] ==3){
                return true;
            }
        }
        return false;
    }

    private boolean pair(int[] f){
        for (int i = 0; i < f.length; i++){
            if (f[i] == 2){
                return true;
            }
        }
        return false;
    }
    
    private boolean twoPairs(int[] f){
        int pairCount = 0;
        for (int i = 0; i < f.length; i++){
            if (f[i] >=2){
                pairCount++;
            }
            if (pairCount >= 2){
                return true;
            }
        }
        return false;
    }
    
} 

