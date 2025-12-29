package Hashmaps;

import java.sql.SQLOutput;
import java.util.HashMap;

public class iterateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Ishita",1);
        map.put("Priyanka",2);
        map.put("Palak",3);
        map.put("Nancy",4);
        map.put("Ridhi",5);
        for(String key:map.keySet()){
            int val=map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();
        for(int val:map.values()){
            System.out.println(val);
        }
        System.out.println();
        for(Object pair:map.entrySet()){
            System.out.println(pair);
        }
    }
}
