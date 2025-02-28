package exception.ex0;

import java.util.*;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자: ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();

        }
        System.out.println("종료");
    }

}
