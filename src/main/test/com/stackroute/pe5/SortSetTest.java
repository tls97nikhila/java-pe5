package com.stackroute.pe5;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortSetTest {

    @Test
    public void setSortPass() {
        String result=SortSet.setSorter("D C B Z").toString();
        assertEquals("[B, C, D, Z]",result);
    }
    @Test
    public void setSorterFailureCase() {
        String result=SortSet.setSorter("hey this is java").toString();
        assertNotEquals("[A, a, a, n]",result);
    }
    @Test
    public void testSorterEmpty() {
        String result=SortSet.setSorter("").toString();
        assertEquals("[]",result);
    }

}