package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> s1 = new HashSet<>(set1);
        s1.addAll(set2);

        Set<Integer> s2 = new HashSet<>(set1);
        s2.retainAll(set2);

        Set<Integer> s3 = new HashSet<>(set1);
        s3.removeAll(set2);


        System.out.println("합집합: " + s1);
        System.out.println("교집합: " + s2);
        System.out.println("차집합: " + s3);
    }
}