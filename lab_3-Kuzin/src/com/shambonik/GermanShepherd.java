package com.shambonik;

public class GermanShepherd extends Dog {

    public GermanShepherd(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Вас напугало, что " + name + " грозно бежит на вас");
    }

    @Override
    public void bark() {
        System.out.println("Вас напугал лай " + name);
    }
}
