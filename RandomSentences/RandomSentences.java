/*Programmer Name: Kyle Riebeling
 * Assignment Start: 6:01 PM 5/26/2023
 * Assignment Completion: 6:43 PM 5/26/2023
 * Total Hours of Assignment: ~ 45 minutes
 * Comments: 
 */

package RandomSentences;

import java.security.SecureRandom;

public class RandomSentences {

    private static final SecureRandom randomNumbers = new SecureRandom();

    public static String []articles = {"the", "a", "one", "some", "any"};
    public static String []noun = {"boy", "girl", "dog", "town", "car"};
    public static String []verb = {"drove", "jumped", "ran", "walked", "skipped"};
    public static String []preposition = {"to", "from", "over", "under", "on"};

    public static void main(String[] args){
        java.util.Date date = new java.util.Date();
        String temp;
        
        for (int i  = 0; i < 20; i++){
            temp = createSentence();
            System.out.println(temp);
        }

        System.out.printf("\nThank you for using the Random Sentences application.\nTime of calculation is %s\n", date);
        System.exit(0);
    }

    public static String createSentence(){

        // Article
        String t = articles[randomNumbers.nextInt(5)];
        t = t.concat(" ");

        // Noun
        int temp = randomNumbers.nextInt(5);
        if (temp >= 3){
            t = t.concat(noun[temp]);
            t = t.concat("s");
        }
        else{
            t = t.concat(noun[temp]);
        }
        t = t.concat(" ");

        // Verb
        t = t.concat(verb[randomNumbers.nextInt(5)]);
        t = t.concat(" ");

        // Preposition
        t = t.concat(preposition[randomNumbers.nextInt(5)]);
        t = t.concat(" ");

        // Article
        t = t.concat(articles[randomNumbers.nextInt(5)]);
        t = t.concat(" ");

        // Noun
        temp = randomNumbers.nextInt(5);
        if (temp >= 3){
            t = t.concat(noun[temp]);
            t = t.concat("s");
        }
        else{
            t = t.concat(noun[temp]);
        }

        // Add period
        t = t.concat(".");

        return t.substring(0, 1).toUpperCase() + t.substring(1);
    }
}
