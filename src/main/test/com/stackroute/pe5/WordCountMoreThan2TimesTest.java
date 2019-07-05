package com.stackroute.pe5;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountMoreThan2TimesTest {
    WordCountMoreThan2Times wordOccurence;
    @Before
    public void setUp()  {
        wordOccurence = new WordCountMoreThan2Times();
    }

    @After
    public void tearDown() throws Exception {
        wordOccurence = null;
    }

    @Test
    public void testwordOccurenceSuccess() {
        String inputStr = "b w w w w z w";
        Map<String, Boolean> expectedString = new HashMap<String, Boolean>();
        expectedString.put("z", false );
        expectedString.put("b", false );
        expectedString.put("w", true );
        Map<String, Boolean> actualString = wordOccurence.wordOccurenceCheck(inputStr);
        assertEquals(expectedString,actualString);
    }

    @Test
    public void testwordOccurenceFailure() {
        String inputStr = "b w z w b";
        Map<String, Boolean> expectedString = new HashMap<String, Boolean>();
        expectedString.put("z", false );
        expectedString.put("b", false );
        expectedString.put("w", true );
        Map<String, Boolean> actualString = wordOccurence.wordOccurenceCheck(inputStr);
        assertNotEquals(expectedString,actualString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(wordOccurence.wordOccurenceCheck(null));
    }

}