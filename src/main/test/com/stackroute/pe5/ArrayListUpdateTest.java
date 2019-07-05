package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListUpdateTest {
        ArrayListUpdate arrayListUpdate;

        @Before
        public void setUp() throws Exception {arrayListUpdate= new ArrayListUpdate();
        }

        @After
        public void tearDown() throws Exception { arrayListUpdate=null;
        }

        @Test
        public void testarrayListCheckUpdate() {
            List<String> input=  new ArrayList<>();
            input.add("Apple");
            input.add("Grape");
            input.add("Melon");
            input.add("Berry");
            //Act
            List<String> Expected=  new ArrayList<>();
            //Arrange
            Expected.add("Kiwi");
            Expected.add("Grape"); Expected.add("Mango"); Expected.add("Berry");
            List<String> Actual=arrayListUpdate.arrayListCheck(input);
            //Assert
            assertEquals(Expected,Actual);

        }
        @Test
        public void testarrayListCheckEmpty() {
            List<String> input= new ArrayList<>();
            input.add("Apple");
            input.add("Grape");
            input.add("Melon");
            input.add("Berry");
            //Act
            List<String> Expected= new ArrayList<>();
            //Arrange
            List<String> Actual= arrayListUpdate.emptyArrayCheck(input);
            //Assert
            assertEquals(Expected,Actual);

        }
}
