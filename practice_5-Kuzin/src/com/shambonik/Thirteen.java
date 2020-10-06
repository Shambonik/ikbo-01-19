package com.shambonik;

import java.util.Scanner;

public class Thirteen {

    private static Scanner in;

    private static void even(){
        int x = in.nextInt();
        if(x!=0){
            odd();
        }
    }

    private static void odd(){
        int x = in.nextInt();
        if(x!=0) {
            System.out.println(x);
            even();
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        odd();
    }
}
