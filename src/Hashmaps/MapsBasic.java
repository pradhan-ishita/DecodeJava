package Hashmaps;

import java.util.HashMap;

public class MapsBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Ishita",1);
        map.put("Priyanka",2);
        map.put("Palak",3);
        map.put("Nancy",4);
        map.put("Ridhi",5);
        System.out.println(map);
        map.put("Bipasha",1);
        System.out.println(map);
        System.out.println(map.containsKey("Ishita"));
        map.remove("Nancy");
        System.out.println(map+" "+map.size());
        map.remove("Ridhi");
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Ishita"));

    }
}
