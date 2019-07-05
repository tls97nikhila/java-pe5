package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountMoreThan2Times {

    //method to check the word or character occurence
    public Map<String, Boolean> wordOccurenceCheck(String inputString){
        Map<String, Integer> occurrences = new HashMap<String, Integer>();
        Map<String, Boolean> wordOccurence = new HashMap<String, Boolean>();
        List<String> inputList = Arrays.asList(inputString.split(" "));
        for ( String word : inputList ) {
            Integer oldCount = occurrences.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            occurrences.put(word, oldCount + 1);
            if((oldCount + 1) == 1)
            {
                wordOccurence.put(word, false); //insert false if the word occurs only once
            }
            else
            {
                wordOccurence.put(word, true); //insert true if the word occurs multiple times
            }
        }
        return wordOccurence;
    }
}
