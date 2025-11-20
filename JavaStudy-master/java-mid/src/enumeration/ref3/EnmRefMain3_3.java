package enumeration.ref3;

public class EnmRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grade = Grade.values();
        for (Grade g : grade) {
            printDiscount(g, price);
        }

    }
    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 할인 금액 : " + grade.discount(price));
    }
}
