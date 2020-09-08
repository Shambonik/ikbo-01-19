package com.shambonik;

public class Hand {
    private float length;
    private boolean paralyzed;

    public Hand(float length, boolean paralyzed) {
        this.length = length;
        this.paralyzed = paralyzed;
    }

    public Hand(float length) {
        this.length = length;
        paralyzed = false;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public boolean isParalyzed() {
        return paralyzed;
    }

    public void setParalyzed(boolean paralyzed) {
        this.paralyzed = paralyzed;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length=" + length +
                ", paralyzed=" + paralyzed +
                '}';
    }
}
