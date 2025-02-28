package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1 networkService = new NetworkServiceV1();

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
