package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] t = text.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < t.length; i++) {
            map.put(t[i], map.getOrDefault(t[i], 0) + 1);
        }
        System.out.println(map);
    }
}
