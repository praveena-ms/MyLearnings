package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnHashMap {
    public static void main(String[] args) {
        //Keys must be unique. Values get overriden if same key is given.
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        if(!hashMap.containsKey("Two"))
            hashMap.put("Two", 22);
        hashMap.putIfAbsent("Two", 22);
        System.out.println(hashMap);

        //Iteration 2 types.
        for(Map.Entry<String, Integer> e: hashMap.entrySet()) { //returns the set of entries in the map
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key: hashMap.keySet()) { // just keyset iteration. Can have similar one for values iteration
            System.out.println(key);
        }

        System.out.println(hashMap.containsValue(3));
        System.out.println(hashMap.remove(3));
        System.out.println(hashMap);
    }
}
