package nested.test;


public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass inner = outerClass2.new InnerClass();
        inner.hello();
    }
}
