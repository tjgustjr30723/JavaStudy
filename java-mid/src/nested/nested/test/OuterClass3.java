package nested.nested.test;

public class OuterClass3 {
    public void myMethod() {
        class LocalClass {

            public void myMethod() {
                System.out.println("LocalClass.myMethod");
            }
        }
    }
}
