package com.shambonik;

public class TestDogs {
    public static void main(String[] args) {
        Chihuahua lol = new Chihuahua("Лол");
        lol.bark();
        lol.run();

        Corgi tatoshka = new Corgi("Татошка");
        tatoshka.bark();
        tatoshka.run();

        GermanShepherd police = new GermanShepherd("Полиция");
        police.bark();
        police.run();
    }
}
