package collection.map;

import java.util.Map;
import java.util.HashMap;
public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100);
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println(containsKey);

        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
