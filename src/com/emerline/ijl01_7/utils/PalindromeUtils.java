package com.emerline.ijl01_7.utils;

/**
 * Created by dzmitry.karayedau on 14-Apr-17.
 */
public class PalindromeUtils {

    public static boolean checkOnPalindrome(long number) {
        StringBuilder stringNumber = new StringBuilder();
        StringBuilder invertStringNumber = new StringBuilder();
        stringNumber.append(number);
        invertStringNumber.append(number);
        invertStringNumber.reverse();
        return stringNumber.toString().equals(invertStringNumber.toString());
    }

}
