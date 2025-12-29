package Hashmaps;
import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.HashSet;
public class basicset {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        //System.out.println(set);
        //search-true/false Time Complexity=O(1)
        //System.out.println(set.contains(50));
        set.add(50);
        //System.out.println(set);
        //System.out.println(set.contains(50));
        //set.remove(20);
        //System.out.println(set);
        //System.out.println(set+" "+set.size());
        Object[] arr = set.toArray();
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        //System.out.println();
    }
}
