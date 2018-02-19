package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int palindromeCount = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j <= input.length(); j++) {
                String subString = input.substring(i, j);
                StringBuilder revesreString = new StringBuilder(subString);
                revesreString.reverse();
                if (subString.equals(revesreString.toString()) && !(subString.equals(""))) {
                    palindromeCount++;
                }
            }
        }
        return palindromeCount;
    }
}
