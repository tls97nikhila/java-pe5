package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CountKeyValue {

    public Map<String, Integer> count(String old)
    {
        StringTokenizer st = new StringTokenizer(old, "://.- __ @ * ? ,");

        ArrayList<String> al=new ArrayList<>();
        while (st.hasMoreTokens())
        {
            al.add(st.nextToken());
        }

        //Creating a HashMap object with elements of inputArray as keys and their count as values
        Map<String, Integer> hm = new HashMap<>();
        //checking every element of the inputArra
        for (String i : al) //take tokens and get value
        {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1); // if first occured assign 1 else increament
        }
        System.out.println(hm);
        return hm;
    }


}
