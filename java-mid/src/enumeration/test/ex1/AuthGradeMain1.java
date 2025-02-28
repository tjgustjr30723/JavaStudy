package enumeration.test.ex1;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrade = AuthGrade.values();
        for (AuthGrade a : authGrade) {
            print(a.name(), a.getLevel(), a.getDescription());
        }
    }
    private static void print(String name, Integer level, String description) {
        System.out.println(name + " " + level + " " + description);
    }
}
