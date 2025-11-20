package lang.wrapper.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        lotto generator = new lotto();
        int[] lottoNumbers = generator.getLotto();

        System.out.print("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
