package com.stackroute.pefive;

/*5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has a value, set the key `val2` to have that value, and
b. Set the key `val1` to have the value `" "` (empty string).
Example 1:
The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":
"java"}
Example 2:
The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":*/

import java.util.HashMap;
import java.util.Map;

public class MapObjectModification {

    /*If the key `val1` has a value, set the key `val2` to have that value, and set the key `val1` to have the value `" "` (empty string).*/

        public static String rotateValue(Map<String, String> map) {

            if (map == null)
            {
                return null;
            }
            String val1 = map.get("val1");

            map.replace("val1", " ");  //replaces val1 with null string
            map.replace("val2", val1); //replaces val1 with val2 //here, c++ will be replaced by java
            return map.toString();
        }


        public static void main(String args[]) {

            Map<String, String> map = new HashMap<>();
            map.put("val1", "java");
            map.put("val2", "c++");
            String mapStore= MapObjectModification.rotateValue(map);
            System.out.println(map.toString()); //expected string val1 will be empty val2 will display java

        }
}

