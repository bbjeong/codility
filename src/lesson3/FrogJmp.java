package lesson3;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class FrogJmp {

    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        int diff = Y - X;
        if (diff == 0) {
            return diff;
        }

        int result = diff / D;
        if ((result * D + X) == Y) {
            return result;
        }
        return result + 1;
    }
}
