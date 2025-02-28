package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int total = 0;
        while (true){
            int n = sc.nextInt();
            if (n == 0) break;
            list.add(n);
            total += n;
        }
        System.out.println("입력한 정수의 합계: "+ total);
        System.out.println("입력한 정수의 평균: "+ total / list.size());
    }
}
