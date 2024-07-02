package app;

import java.util.function.Function;

public class StringListProcessor {
    public static int countUppercase(String s) {
        Function<String, Integer> convertToInteger = Integer::valueOf;
        int result = convertToInteger.apply(s);
        System.out.println("Кількість великих літер у рядку: " + result);
        return result;
    }


}
