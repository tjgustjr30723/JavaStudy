package generic.ex4;

public class GenericMethod {

    public static Object objectMethod(Object obj) {
        System.out.println(obj);
        return obj;
    }

    public static <T> T genericMethod(T t) {
        System.out.println(t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println(t);
        return t;
    }
}
