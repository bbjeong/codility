package lesson6;

// you can also use imports, for example:

import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Triangle {

    public int solution(int[] A) {
        // write your code in Java SE 8

        if (A.length < 3) {
            return 0;
        }
        Arrays.sort(A);

        int start = 0;
        while (start < A.length) {
            if (A[start] > 0) {
                break;
            }
            start++;
        }

        if (start >= A.length) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = (i + 1); j < A.length - 1; j++) {

                if ((long) A[i] + (long) A[j] > (long) A[j + 1]) {
                    result = 1;
                    break;
                }
            }
            if (result == 1) {
                break;
            }
        }

        return result;
    }
}
