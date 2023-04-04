package org.example;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class BuggyFactorialTest {

    @Test
    public void myBuggyFact() {
        BuggyFactorial fact = new BuggyFactorial();
        assertEquals(24,fact.myBuggyFact(4));
        assertEquals(1,fact.myBuggyFact(0));
    }
}