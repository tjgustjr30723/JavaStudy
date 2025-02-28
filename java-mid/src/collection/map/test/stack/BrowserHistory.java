package collection.map.test.stack;

import java.util.*;

public class BrowserHistory {
    private Deque<String> deque = new ArrayDeque<String>();

    public void visitPage(String s) {
        deque.push(s);
        System.out.println("방문: " + s);
    }

    public String goBack() {
        deque.pop();
        System.out.println("뒤로 가기: " + deque.peek());
        return deque.peek();
    }
}
