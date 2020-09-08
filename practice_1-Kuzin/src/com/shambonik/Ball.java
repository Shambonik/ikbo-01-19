package com.shambonik;

public class Ball {
    private float diameter;

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public Ball(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "diameter=" + diameter +
                '}';
    }
}
