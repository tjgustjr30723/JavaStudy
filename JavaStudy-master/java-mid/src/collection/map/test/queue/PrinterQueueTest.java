package collection.map.test.queue;

import java.util.*;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();
        printQueue.offer("a");
        printQueue.offer("b");
        printQueue.offer("c");
        System.out.println(printQueue.poll());
        System.out.println(printQueue.poll());
        System.out.println(printQueue.poll());
    }
}
