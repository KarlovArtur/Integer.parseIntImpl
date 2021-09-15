package com.karlov;

/**
 * This class implements a converter of a string that begins with the arithmetic sign + or -,
 * string must be of a strictly specified length, have only numeric characters.
 * <p>
 * Floating point values are not supported in this class.
 * Inside the method, string is checked for the required length and correct input.
 *
 * @author Artur Karlov
 * @version 1.0
 * @see NumberFormatter
 */
public class NumberFormatter {

    /**
     * @param str - users input;
     * @return int - numeric value;
     * @throws NumberFormatException;
     */
    public static int parseInt(String str) {
        int index = 1;
        int numericValue = 0;
        boolean isNegative = str.charAt(0) == '-';
        int minLength = 2;
        long maxLength = 4294967295L; // 2^32-1

        //Checking for the correct length of the input string
        if (str.length() < minLength || str.length() > maxLength) {
            throw new NumberFormatException("Length of the input string must be 2 ≤ |s| ≤ 2 32 -1");
        }
        //Checking a string for only numeric characters
        if (!str.matches("[+-]\\d*")) {
            throw new NumberFormatException("String should contain positive and negative numeric values in\n" +
                    "stringified format from the range [0-9] and arithmetical operation signs [‘+’, ‘-’] before numeric value");
        }
        //Process each character of the string;
        while (index < str.length()) {
            numericValue *= 10;
            numericValue += str.charAt(index) - '0'; //Minus the ASCII code of '0' (48) to get the value of the charAt(index).
            index++;
        }

        //Checking a boolean flag before returning a result
        if (isNegative) {
            return -numericValue;
        }
        return numericValue;

    }

}
