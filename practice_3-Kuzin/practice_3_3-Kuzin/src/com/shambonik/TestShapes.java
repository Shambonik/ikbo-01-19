package com.shambonik;

public class TestShapes {
    public static void main(String[] args){
        Rectangle rect = new Rectangle("green", true,2,3);
        System.out.println(rect);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        Circle circle = new Circle("red", false, 4);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Square square = new Square("Blue", true, 5);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
