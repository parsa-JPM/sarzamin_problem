package find_duplicate;

import java.util.HashSet;
import java.util.Random;

public class Problem {

    private int[] integers;
    private int N;
    private HashSet<Integer> result = new HashSet<Integer>();


    public int[] getNumbers() {
        return integers;
    }

    public void setIntegers(int[] integers) {
        this.integers = integers;
    }

    public void fillRandomIntegers(int n) {
        Random rnd = new Random();
        integers = new int[n + 1];
        for (int i = 0; i < integers.length; i++) {
            //minimum is 1
            //maximum is n
            integers[i] = rnd.nextInt(n) + 1;
        }
    }

    public HashSet<Integer> solve() {
        if (integers == null)
            return null;
        findDuplicates(integers, integers.length);
        return result;
    }

    private void findDuplicates(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            int index = getPositiveValueInSpecificIndex(arr, i);
            if (arr[index] >= 0)
                arr[index] = -arr[index];
            else
                result.add(Math.abs(arr[i]));
        }
    }

    private int getPositiveValueInSpecificIndex(int[] arr, int i) {
        return Math.abs(arr[i]);
    }


}
