package com.stackroute.pe5;

import java.util.Map;
public class ModifyKeyValue {

        public String modifiedArray(Map<String, String> map) {

            //checks if map is null or not
            if(map == null){
                return null;
            }
            //replaces key values
            String valueof1 = map.get("val1");
            map.replace("val2",valueof1); //"val2" keys values will be changed to valueof1
            map.replace("val1","");         //make val1 's value to empty

            return map.toString();
        }
}
