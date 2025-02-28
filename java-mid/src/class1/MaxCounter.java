package class1;

public class MaxCounter {
    private int count=0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }
    public void increment(){
        if (count >= max) {
            System.out.println("최대치 입니다.");
        }
        else {
            count++;
        }
    }
    int getCount(){
        return count;
    }
}