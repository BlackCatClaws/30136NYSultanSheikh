

package datastructure;

import java.util.HashMap;
import java.util.Map;

public class CollectionView {

    public static void main(String[] args) {
        /*
         Map has been made and data is inserted. Retrieve the Collection view of values is present in the map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        System.out.println("Collection view of values present in map ");

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}