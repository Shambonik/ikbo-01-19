package com.shambonik;

public class Factorial {

    public static int count(int number)
    {
        for(int n = number-1;n>0;n--) number *= n;
        return number;
    }

}
