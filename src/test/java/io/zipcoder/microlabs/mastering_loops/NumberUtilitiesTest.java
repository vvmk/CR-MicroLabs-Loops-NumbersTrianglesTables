package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

public class NumberUtilitiesTest {
    @Test
    public void testGetRange1() {
        // : Given
        String expected = "51015";
        int start = 5;
        int stop = 20;
        int step = 5;

        // : When
        String actual = NumberUtilities.getRange(start, stop, step);

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange2() {
        // : Given
        String expected = "012345678910111213141516171819";
        int start = 0;
        int stop = 20;
        int step = 1;

        // : When
        String actual = NumberUtilities.getRange(start, stop, step);

        // : Then
        Assert.assertEquals(expected, actual);
    }














    @Test
    public void testGetOddNumbers() {
        // : Given
        String expected = "5791113151719";
        int start = 5;
        int stop = 20;

        // : When
        String actual = NumberUtilities.getOddNumbers(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetEvenNumbers() {
        // : Given
        String expected = "681012141618";
        int start = 5;
        int stop = 20;

        // : When
        String actual = NumberUtilities.getEvenNumbers(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testGetSquareNumbers() {
        // : Given
        String expected = "25100225";
        int start = 5;
        int stop = 20;
        int step = 5;

        // : When
        String actual = NumberUtilities.getSquareNumbers(start, stop, step);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPerfectSquares() {
        // : Given
        String expected = "14916253649";
        int start = 1;
        int stop = 50;

        // : When
        String actual = NumberUtilities.getPerfectSquares(start, stop);
    }


    @Test
    public void testGetExponentiationNumbers() {
        // : Given
        String expected = "25100225";
        int start = 5;
        int stop = 20;
        int step = 5;
        int exponent = 2;

        // : When
        String actual = NumberUtilities.getExponentiations(start, stop, step, exponent);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetRangeWithOneParam() {
        // : Given
        String expected = "0123456789101112131415161718";
        int stop = 19;

        // : When
        String actual = NumberUtilities.getRange(stop);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetRangeWithTwoParams() {
        // : Given
        String expected = "5678910";
        int start = 5;
        int stop = 11;

        // : When
        String actual = NumberUtilities.getRange(start, stop);

        Assert.assertEquals(expected, actual);
    }
}
