package com.shambonik;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 20);
        System.out.println(ball);
        ball.move(2,-5);
        System.out.println(ball);
    }
}
