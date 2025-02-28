package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer i = Integer.valueOf(str);
        int intValue = i.intValue();
        Integer i2 = Integer.valueOf(intValue);

        System.out.println(i);
        System.out.println(intValue);
        System.out.println(i2);

    }
}
