package lesson2;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        int len = A.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int movedIdx = (i + K) % len;
            result[movedIdx] = A[i];
        }

        return result;
    }
}
