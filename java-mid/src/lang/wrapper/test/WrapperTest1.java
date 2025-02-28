package lang.wrapper.test;

import java.util.Random;

public class WrapperTest1 {
    public static void main(String[] args) {
        lotto lotto = new lotto();
        int[] a = lotto.getLotto();
        System.out.print("로또 번호: ");
        for (int s: a){
            System.out.print(s+" ");
        }

    }
}