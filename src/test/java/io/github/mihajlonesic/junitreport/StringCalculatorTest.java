package io.github.mihajlonesic.junitreport;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class StringCalculatorTest {

    @Test
    public final void whenConstructorIsCalledNothingHappens() {
        StringCalculator sc = new StringCalculator();
        assertTrue(true);
    }

    @Ignore
    @Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator.add("1,2,3");
    }

    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,X");
    }

    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
        assertEquals(2, StringCalculator.add("2"));
    }

    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }

    @Test
    public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
        assertEquals(3+6+15, StringCalculator.add("3,6\n15"));
    }

    @Ignore
    @Test
    public final void whenSumIsGreaterThan100ThenReturn100() {
        assertEquals(100, StringCalculator.add("55,75,25"));
    }
}
