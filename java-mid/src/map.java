
import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);
        Map<String, Integer> map2 = new HashMap<>();
        for (String i : map.keySet()) {
            if (map.get(i) == 1000) {
                map2.put(i, map.get(i));
            }
        }
        System.out.println(map2.keySet());
    }
}
