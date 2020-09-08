package com.shambonik;

public class Corgi extends Dog{
    public Corgi(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Вас расмешил бег " + name);
    }

    @Override
    public void bark() {
        System.out.println("Вам понравилось, как лает " + name);
    }
}
