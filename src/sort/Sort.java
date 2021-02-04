package sort;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(675);
        list.add(8);
        list.add(88);
        list.add(932);
        list.add(86);
        list.add(5);
        list.add(243);
        list.add(98);
        list.add(39);
        list.add(32);

        int m=0;
        for (int i=0; i<list.size(); i++){
            for (int j=0; j<list.size(); j++) {
                if (list.get(i) <= list.get(j)) {
                    continue;
                } else {
                    m=list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, m);
                }
            }
        }

        for (int k=0; k<list.size(); k++) {
            System.out.println(list.get(k));
        }
    }
}
