package find_n_and_m;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Problem {
    private int[] numbers;
    public int x;

    public int[] getNumbers() {
        return numbers;
    }


    public void setNumbers(int[] numbers, int x) {
        this.numbers = numbers;
        this.x = x;
    }

    public int[] solve() {
        int startPointer = 0;
        int endPointer = findIndexOfX(x) - 1;

        while (startPointer != endPointer) {

            if (numbers[startPointer] + numbers[endPointer] == x)
                return new int[]{numbers[startPointer], numbers[endPointer]};

            if (numbers[startPointer] + numbers[endPointer] > x)
                endPointer--;

            if (numbers[startPointer] + numbers[endPointer] < x)
                startPointer++;
        }

        if (numbers[startPointer] + numbers[endPointer] == x)
            return new int[]{numbers[startPointer], numbers[endPointer]};

        return null;
    }


    private int findIndexOfX(int target) {
        return Arrays.stream(numbers)                    // IntStream
                .boxed()                        // Stream<Integer>
                .collect(Collectors.toList())   // List<Integer>
                .indexOf(target);
    }


    public void fillRandomNumbers(int len) {
        int numbersLength = len;

        numbers = new int[numbersLength];
        Random rnd = new Random();
        int xIndex = rnd.nextInt(numbersLength);
        for (int i = 0; i < numbersLength; i++) {
            if (xIndex == i) {
                int n = numbers[rnd.nextInt(i)];
                int m = numbers[rnd.nextInt(i)];
                numbers[i] = n + m;
                x = numbers[i];
            } else
                numbers[i] = rnd.nextInt(100);
        }

        Arrays.sort(numbers);
    }

}
