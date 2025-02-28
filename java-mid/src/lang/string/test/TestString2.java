package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String re = new StringBuilder(str).reverse().toString();
        System.out.println(re);
    }
}
