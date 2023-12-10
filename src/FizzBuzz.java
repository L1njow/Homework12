import java.util.Arrays;
import java.util.StringJoiner;

public class FizzBuzz {
    private volatile String[] numbers;

    public FizzBuzz(int number) {
        if (number > 0) {
            numbers = new String[number];
            for (int i = 1; i <= number; i++) {
                numbers[i - 1] = Integer.toString(i);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void printNumbers(int threadNumber) {
        String result;
        for (int i = 0; i < numbers.length; i++) {
            switch (threadNumber) {
                case 1:
                    result = fizz(i + 1);
                    if (result != null) {
                        numbers[i] = result;
                    }
                    break;
                case 2:
                    result = buzz(i + 1);
                    if (result != null) {
                        numbers[i] = result;
                    }
                    break;
                case 3:
                    result = fizzbuzz(i + 1);
                    if (result != null) {
                        numbers[i] = result;
                    }
                    break;
            }
        }
    }

    private String fizz(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            return "fizz";
        }
        return null;
    }

    private String buzz(int number) {
        if (number % 5 == 0 && number % 3 != 0) {
            return "buzz";
        }
        return null;
    }

    private String fizzbuzz(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return "fizzbuzz";
        }
        return null;
    }

    public void number() {
        StringJoiner result = new StringJoiner(", ");
        for (String number : numbers) {
            result.add(number);
        }
        System.out.println(result);
    }
}
