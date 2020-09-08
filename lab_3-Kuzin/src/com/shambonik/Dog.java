package com.shambonik;

public abstract class Dog {
    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    public abstract void run();
    public abstract void bark();
}
