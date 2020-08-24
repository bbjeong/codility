package com.codility.lesson1;

public class BinaryGap {
    // you can also use imports, for example:
    // import java.util.*;

    // you can write to stdout for debugging purposes, e.g.
    // System.out.println("this is a debug message");

    public int solution(int N) {
        // write your code in Java SE 8

        char[] charArr = Integer.toBinaryString(N).toCharArray();
        int bg = 0;
        int maxBg = 0;
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < charArr.length; i++) {
            int el = charArr[i] - '0';
            if (el == 1) {
                bg = zeroCount;
                if (bg > maxBg) {
                    maxBg = bg;
                }
                oneCount = 1;
                zeroCount = 0;
            } else if (el == 0) {
                zeroCount++;
            }
        }

        return maxBg;
    }


}
