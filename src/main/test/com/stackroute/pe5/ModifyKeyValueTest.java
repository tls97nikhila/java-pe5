package com.stackroute.pe5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ModifyKeyValueTest {
        ModifyKeyValue mapModify;

        @Before
        public void setUp() {
            mapModify = new ModifyKeyValue();
        }

        @After
        public void tearDown() {
            mapModify = null;
        }

        @Test
        public void modifiedArrayForPass() {
            Map<String ,String> map = new HashMap<>();
            map.put("val1","java");
            map.put("val2","c++");
            String expected = "{val2=java, val1=}";
            String actual = mapModify.modifiedArray(map);
            assertEquals(expected,actual);
        }
        @Test
        public void modifiedArrayForPass2() {
            Map<String ,String> map = new HashMap<>();
            map.put("val1","mars");
            map.put("val2","saturn");
            String expected = "{val2=mars, val1=}";
            String actual = mapModify.modifiedArray(map);
            assertEquals(expected,actual);
        }
        @Test
        public void modifiedArrayFail() {
            String actual = mapModify.modifiedArray(null);
            assertNull(actual);
        }
    }
