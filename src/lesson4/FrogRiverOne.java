package lesson4;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        // write your code in Java SE 8

        int[] positions = new int[X];
        int result = -1;
        int count = 0;
        int i;
        for (i = 0; i < A.length; i++) {
            int idx = A[i] - 1;
            if (idx < X) {
                if (positions[idx] == 0) {
                    positions[idx]++;
                    count++;
                }
            }

            if (count == X) {
                result = i;
                break;
            }
        }

        return result;
    }

}
