package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        return sentence.split(" ");
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] splitSentence = sentence.split(" ");

        return splitSentence[0] ;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] splitSentence = sentence.split(" ");
        StringBuilder firstWord = new StringBuilder(splitSentence[0]);
        return firstWord.reverse().toString();
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String[] splitSentence = sentence.split(" ");
        StringBuilder firstWord = new StringBuilder(splitSentence[0]);
        String reverseword = firstWord.reverse().toString();
        return reverseword.substring(0,1).toUpperCase() + reverseword.substring(1);
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String[] splitString = str.split("");
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(splitString));
        stringArrayList.remove(index);
        StringBuilder newString = new StringBuilder();
        String[] newStringArray = stringArrayList.toArray(new String[stringArrayList.size()]);
        for (int i = 0; i < stringArrayList.size(); i++) {
            newString.append(newStringArray[i]);
        }
        return newString.toString();
    }

}
