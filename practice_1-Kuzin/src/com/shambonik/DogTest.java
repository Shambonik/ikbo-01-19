package com.shambonik;

public class DogTest {
    public static void main(String[] args) {
        Ball ball = new Ball(5);
        Dog dog = new Dog("Pushok", ball);
        System.out.println(dog.toString());
    }
}
