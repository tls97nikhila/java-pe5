package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountKeyValueTest {

    public static CountKeyValue cs;

        @Before
        public  void setup()
        {
            //arrange
            cs = new CountKeyValue();
        }

        @After

        public  void teardown()
        {
            //arrange
            cs = null;
        }

        @Test
        public void countString_StringGiven_ShouldReturnHashMap()
        {
            //arrange
            String str = "one one -one___two,,three,one @three*one?two";
            Map<String, Integer> expected = new HashMap<String , Integer>();
            expected.put("one" , 5);
            expected.put("two" , 2);
            expected.put("three" , 2);
            Map actual = cs.count(str);
            assertEquals(expected, actual); //act and assert
        }
}
