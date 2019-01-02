package find_n_and_m;

import java.util.Arrays;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Problem problem = new Problem();

         problem.setNumbers(new int[]{1, 3, 8, 12, 15, 17, 25, 80, 145, 156}, 25);

         // uncomment to fill random numbers
        // problem.fillRandomNumbers(10);

        System.out.println(Arrays.toString(problem.getNumbers()));

        System.out.println("X is : "+problem.x);

        System.out.println("My answer : " + Arrays.toString(problem.solve()));
    }
}
