package study;

public class DefaultPay implements Pay {
    public boolean pay(int amount) {
        System.out.println("오류 발생.");
        return false;
    }
}
