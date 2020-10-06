package com.shambonik;

import java.util.Scanner;

public class Fifteen {
    private static void divide(int n){
        if(n>0) {
            System.out.print((n % 10) + " ");
            divide(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        divide(in.nextInt());
    }
}
