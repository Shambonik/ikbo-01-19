package com.shambonik;

import java.util.Scanner;

public class Sixteen {

    private static Scanner in;

    private static int maxCount(int max, int count){
        int x = in.nextInt();
        if(x!=0) {
            if (x > max)
                count = maxCount(x, 1);
            else if (x == max)
                count = maxCount(max, count + 1);
            else
                count = maxCount(max, count);
        }
        return count;
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.print(maxCount(0, 0));
    }
}
