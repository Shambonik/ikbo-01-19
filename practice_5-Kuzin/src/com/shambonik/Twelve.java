package com.shambonik;

import java.util.Scanner;

public class Twelve {
    private static Scanner in;

    private static void odd(){
        int x = in.nextInt();
        if(x!=0) {
            if(x%2==1) System.out.println(x);
            odd();
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        odd();
    }
}
