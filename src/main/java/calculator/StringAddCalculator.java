package calculator;

public class StringAddCalculator {

    public static final String COMMA_SEPARATOR = ",";

    public static int splitAndSum(String text) {
        if (isBlank(text)) {
            return 0;
        }
        return sum(toInts(split(text)));
    }

    private static int sum(int[] numbers) {
        int result = 0;
       for (int number : numbers) {
           result += number;
       }
        return result;
    }

    private static String[] split(String text) {
        return text.split(COMMA_SEPARATOR);
    }

    private static boolean isBlank(String text) {
        return text == null || text.isBlank();
    }

    private static int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }
}
