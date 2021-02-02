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
    public void returnsLargestNumber() {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 2, 3"), containsString("3"));
    }

    @Test
    public void returnsTheresaMayElection() {
        assertThat(queryProcessor.process("Theresa May"), containsString("2017"));
    }

    @Test
    public void returnsProduct() {
        assertThat(queryProcessor.process("what is 3 multiplied by 7"), containsString("21"));
    }

    @Test
    public void checkSquareCube() {
        assertThat(queryProcessor.process("which of the following numbers is both a square and a cube: 64, 791, 441, 816"), containsString("64"));
    }
}
