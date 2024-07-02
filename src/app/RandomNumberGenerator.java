package app;

import java.util.function.Supplier;

public class RandomNumberGenerator {
    public  static int generateRandomNumber(int min, int max){
        min = 1;
        max = 100;
        int count = 0;
        Supplier<Integer> randomRes = () -> (int) (Math.random() * 100);
        for (int i = min; i < max; i++){
            count++;
            System.out.println(count + ") Result is " +
                    randomRes.get());

        }


        return randomRes.get();
    }
}
