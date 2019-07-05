package com.stackroute.pe5;


import java.util.List;

public class ArrayListUpdate {


    public List<String> arrayListCheck(List<String> list1)
    {
        list1.set(0,"Kiwi");
        list1.set(2,"Mango");  // replace two values, update
        return list1;
    }
    public List<String> emptyArrayCheck(List<String> list2)
    {
        List<String> str = new java.util.ArrayList<>(list2);
        str.removeAll(str);   // empty whole list
        return str;
    }
}
