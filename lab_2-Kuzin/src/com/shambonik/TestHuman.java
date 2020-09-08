package com.shambonik;

public class TestHuman {
    public static void main(String[] args) {
        System.out.println(new Human(new Head(30, false, 2, 2, 5),
               new Hand(80.2f, false), new Hand(81.1f, true),
                new Leg (110.1f, false), new Leg(109.6f, true),
                175.3f, "Hali Gali"));
    }
}
