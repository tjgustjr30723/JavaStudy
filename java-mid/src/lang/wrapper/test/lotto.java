package lang.wrapper.test;

import java.util.Random;

public class lotto {
    private Random random = new Random();
    private int[] lotto = new int[6];
    private int count;

    public int[] getLotto(){
        count = 0;

        while(count < 6){
            int index = random.nextInt(45) + 1;
            if(Unique(index)){
                lotto[count] = index;
                count++;
            }
        }
        return lotto;
    }

    public boolean Unique(int index){
        for (int i = 0; i < count; i++) {
            if(lotto[i] == index){
                return false;
            }

        }
        return true;
    }
}
