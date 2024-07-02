package app;

public class Main {
    static StringManipulator stringManipulator;
    static String s;
    static String output;
    int result;

    static MathOperation mathOperation;
    static int sum;
    static int a;
    static int b;

    public static void main(String[] args) {

        a = 2;
        b = 23;
        mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        sum = mathOperation.operate(a, b);
        System.out.println("Result is " + sum);

        stringManipulator = new StringManipulator() {
            @Override
            public String getOutput(String s) {
                return super.toString();
            }
        };

        s = "Hello, World!";
        stringManipulator = (s) -> s.toUpperCase();
        output = stringManipulator.getOutput(s);
        System.out.println(output);


        StringListProcessor stringListProcessor = new StringListProcessor();
        stringManipulator = (s) -> {
            String s1 = String.valueOf(stringListProcessor.countUppercase(s));

            return s1;
        };

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int min = 1;
        int max = 100;
        randomNumberGenerator.generateRandomNumber(min, max);


    }


}
