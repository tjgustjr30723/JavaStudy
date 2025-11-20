package static2.ex;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        System.out.println("sum=" + MthArrayUtils.sum(values));
        System.out.println("average=" + MthArrayUtils.average(values));
        System.out.println("min=" + MthArrayUtils.min(values));
        System.out.println("max=" + MthArrayUtils.max(values));
    }
}
