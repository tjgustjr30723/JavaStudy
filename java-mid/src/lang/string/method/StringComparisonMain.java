package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "Hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str2 equalsIgnoreCase str3: " + str2.equalsIgnoreCase(str3));

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str3));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));

        System.out.println("str1 starts with 'Hello" + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java!'" + str1.endsWith("Java!"));
    }
}
