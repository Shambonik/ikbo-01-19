package com.shambonik;

public class Chihuahua extends Dog{

    public Chihuahua(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println("Вас напугало, что " + name + " смешно побежал на вас");
    }

    @Override
    public void bark() {
        System.out.println("Вроде этот " + name + " такой мелкий, а лает очень страшно");
    }
}
