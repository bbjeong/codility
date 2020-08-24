package lesson5;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class PassingCars {

    public int solution(int[] A) {
        // write your code in Java SE 8

        if (A.length == 1) {
            return 0;
        }

        int start = 0;
        while (start < A.length) {
            if (A[start] == 0) {
                break;
            }
            start++;
        }

        if (start == A.length) {
            return 0;
        }

        int pCount = 0;
        int result = 0;
        for (int i = start; i < A.length; i++) {
            if (A[i] == 0) {
                pCount++;
            } else {
                result += pCount;
            }

            if (result > 1000000000) {
                result = -1;
                break;
            }
        }

        return result;
    }
}
