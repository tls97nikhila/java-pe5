package com.stackroute.pe5;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {
    public static ArrayList<String> setSorter(String s)
    {
        String[] keys=s.split(" ");

        Set<String> treeSet= new TreeSet<>();  //  TreeSet obj to store sorted set
        for (String k:keys)
        {
            treeSet.add(k);  // add split elements to
        }
        return new ArrayList<>(treeSet);  // return arraylist
    }
}