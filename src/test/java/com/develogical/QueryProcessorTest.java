package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void addsTwoNumbers() throws Exception {
        assertThat(queryProcessor.process("what is 5 plus 10"), containsString("15"));
    }

    @Test
    public void returnsLargestNumber() {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 2, 3"), containsString("3"));
    }
}
