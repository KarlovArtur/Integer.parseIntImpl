package com.karlov;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumberFormatterTest {

    @Test(expected = NumberFormatException.class)
    public void stringContainsDigitsAndOtherSymbols() {
        String str = "sss3523";
        NumberFormatter.parseInt(str);
    }

    @Test(expected = NumberFormatException.class)
    public void stringDoesNotContainArithmeticalSigns() {
        String str = "3523";
        NumberFormatter.parseInt(str);
    }

    @Test
    public void stringReturnPositiveNumber() {
        int expected = 12345;
        int result = NumberFormatter.parseInt("+12345");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void stringReturnNegativeNumber() {
        int expected = -12345;
        int result = NumberFormatter.parseInt("-12345");
        Assertions.assertEquals(expected, result);
    }

    @Test(expected = NumberFormatException.class)
    public void minimalLengthCheck() {
        String str = "1";
        NumberFormatter.parseInt(str);
    }

    @Test(expected = NullPointerException.class)
    public void throwsAnExceptionWhenStringIsNull() {
        String str = null;
        NumberFormatter.parseInt(str);
    }
}