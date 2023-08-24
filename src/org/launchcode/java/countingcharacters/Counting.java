package org.launchcode.java.countingcharacters;
import java.util.HashMap;
import java.util.ArrayList;
public class Counting {
    // Class Variables

    // Constructors
    public Counting() {

    }

    // Methods
    public void countCharacters(String wordToCount) {
        char[] arrayOfChars = wordToCount.toCharArray();
        HashMap<Character, Integer> myCharacterCount = new HashMap<>();
        for (int i = 0; i < arrayOfChars.length; i++) {
            // add or update the count of each character into the hashmap

            char theCharacter = arrayOfChars[i];
            if (myCharacterCount.containsKey(theCharacter) == false) {
                // Does NOT contain the key!!
                myCharacterCount.put(theCharacter, 1);
            } else {
                // TOTALLY does contain the key!
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue = theValue + 1;
                myCharacterCount.put(theCharacter, theValue);
            }
        }
        /*
        I: #
         */
        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        for(int i = 0; i < myCharacterKeys.size(); i++) {
            Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ": " + theValue);
        }
    }
}
