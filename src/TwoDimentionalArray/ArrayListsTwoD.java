package TwoDimentionalArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsTwoD {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        List<Integer> b=new ArrayList<>();
        b.add(40);b.add(50);
        List<Integer>c=new ArrayList<>();
        List<Integer> d= new ArrayList<>();
        d.add(60);
        List<List<Integer>> e=new ArrayList<>();
        e.add(a);e.add(b);e.add(c);e.add(d);
        for (int i = 0; i < e.size(); i++) {
            for (int j = 0; j < e.get(i).size(); j++) {
                System.out.print(e.get(i).get(j)+" ");

            }
            System.out.println();
        }
    }
}
