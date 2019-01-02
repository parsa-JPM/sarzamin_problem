package find_duplicate;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Problem problem = new Problem();

        problem.setIntegers(new int[]{1,5,4,7,9,8,3,6,8,2,3});
//        problem.fillRandomIntegers(9);

        System.out.println(Arrays.toString(problem.getNumbers()));

        System.out.println("The repeating elements are : " + problem.solve());
    }
}
