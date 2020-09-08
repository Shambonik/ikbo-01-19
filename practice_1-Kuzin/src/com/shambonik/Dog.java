package com.shambonik;

public class Dog {
    private String name;
    private Ball ball;

    public Dog(String name, Ball ball){
        this.name = name;
        this.ball = ball;
    }

    public Dog(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ball=" + ball.toString() +
                '}';
    }
}
