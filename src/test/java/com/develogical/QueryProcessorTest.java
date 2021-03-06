package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void addsTwoNumbers() throws Exception {
        assertThat(queryProcessor.process("what is 2012 plus 204"), containsString("2216"));
    }

    @Test
    public void addsNumbersWithPercentSep() throws Exception {
        assertThat(queryProcessor.process("q=253d8470:%20what%20is%206%20multiplied%20by%203"), containsString("18"));
    }

    @Test
    public void returnsLargestNumber() {
        assertThat(queryProcessor.process("q=253d8470:which of the following numbers is the largest: 2, 3"), containsString("3"));
    }

    @Test
    public void returnsTheresaMayElection() {
        assertThat(queryProcessor.process("Theresa May"), containsString("2017"));
    }

    @Test
    public void returnsEiffelTowerCity() {
        assertThat(queryProcessor.process("Eiffel tower"), containsString("Paris"));
    }

    @Test
    public void returnsProduct() {
        assertThat(queryProcessor.process("what is 3 multiplied by 7"), containsString("21"));
    }

    @Test
    public void checkSquareCube() {
        assertThat(queryProcessor.process("q=253d8470:which of the following numbers is both a square and a cube: 64, 791, 441, 816"), containsString("64"));
    }

    @Test
    public void returnsPrime() {
        assertThat(queryProcessor.process("q=253d8470:which of the following numbers are prime: 7, 9, 13, 12"), containsString("7, 13"));
    }

    @Test
    public void drNoJamesBond() {
        assertThat(queryProcessor.process("who played James Bond in the film Dr No"), containsString("Sean Connery"));
    }

    @Test

    public void returnsMinus() {
        assertThat(queryProcessor.process("what is 7 minus 3"), containsString("4"));
    }

    @Test
    public void fibonacci() {
        assertThat(queryProcessor.process("what is the 17th number in the Fibonacci sequence"), containsString("1597"));
    }
}
