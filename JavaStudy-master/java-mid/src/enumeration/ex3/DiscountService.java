package enumeration.ex3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discount = 0;
        if (grade == Grade.BASIC)
            discount = 10;
        else if (grade == Grade.GOLD) {
            discount = 20;
        } else if (grade == Grade.DIAMOND) {
            discount = 30;
        }
        else
            System.out.println("할인 x");

        return price * discount / 100;
    }
}

