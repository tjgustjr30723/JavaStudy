package poly.basic;

public class PolyMain {
    public static void main(String[] args){
        Parent parent = new Parent();
        parent.parentMethod();
        Child child = new Child();
        child.childMethod();

        Parent poly = new Child();
        poly.parentMethod();
        ((Child) poly).childMethod(); //다운 캐스팅
        Child child1 = new Child();
        Child child2 = new Child();
        Parent parent1 = (Parent) child1; //업 캐스팅
        Parent parent2 = child2; //parent 생략가능 업 캐스팅

    }
}
