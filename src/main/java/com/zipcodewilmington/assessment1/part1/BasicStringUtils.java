package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder(str);

        return strBuilder.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        String strReverse = strBuilder.reverse().toString();

        return strReverse.substring(0,1).toUpperCase() + strReverse.substring(1);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1, str.length() -1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strArray;
        strArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++ ) {
            char charAtSpot = strArray[i];
            if (Character.isUpperCase(charAtSpot)) {
                strBuilder.append(Character.toLowerCase(charAtSpot));
            }else if (Character.isLowerCase(charAtSpot)) {
                strBuilder.append(Character.toUpperCase(charAtSpot));
            } else if (Character.isSpace(charAtSpot)) {
                strBuilder.append(" ");
            }
        }
        return strBuilder.toString();
    }
}
