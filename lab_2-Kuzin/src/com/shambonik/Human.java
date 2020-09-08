package com.shambonik;

public class Human {
    private Head head;
    private Hand hand_left;
    private Hand hand_right;
    private Leg leg_left;
    private Leg leg_right;
    private float height;
    private String name;

    public Human(Head head, Hand hand_left, Hand hand_right, Leg leg_left, Leg leg_right, float height, String name) {
        this.head = head;
        this.hand_left = hand_left;
        this.hand_right = hand_right;
        this.leg_left = leg_left;
        this.leg_right = leg_right;
        this.height = height;
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand_left() {
        return hand_left;
    }

    public void setHand_left(Hand hand_left) {
        this.hand_left = hand_left;
    }

    public Hand getHand_right() {
        return hand_right;
    }

    public void setHand_right(Hand hand_right) {
        this.hand_right = hand_right;
    }

    public Leg getLeg_left() {
        return leg_left;
    }

    public void setLeg_left(Leg leg_left) {
        this.leg_left = leg_left;
    }

    public Leg getLeg_right() {
        return leg_right;
    }

    public void setLeg_right(Leg leg_right) {
        this.leg_right = leg_right;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head.toString() +
                ", hand_left=" + hand_left.toString() +
                ", hand_right=" + hand_right.toString() +
                ", leg_left=" + leg_left.toString() +
                ", leg_right=" + leg_right.toString() +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
