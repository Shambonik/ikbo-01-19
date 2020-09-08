package com.shambonik;

public class Head {
    private float diameter;
    private boolean baldness;
    private int numberOfEyes;
    private int numberOfEars;
    private float lenOfNose;

    public Head(float diameter, boolean baldness, int numberOfEyes, int numberOfEars, float lenOfNose) {
        this.diameter = diameter;
        this.baldness = baldness;
        this.numberOfEyes = numberOfEyes;
        this.numberOfEars = numberOfEars;
        this.lenOfNose = lenOfNose;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public boolean isBaldness() {
        return baldness;
    }

    public void setBaldness(boolean baldness) {
        this.baldness = baldness;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfEars() {
        return numberOfEars;
    }

    public void setNumberOfEars(int numberOfEars) {
        this.numberOfEars = numberOfEars;
    }

    public float getLenOfNose() {
        return lenOfNose;
    }

    public void setLenOfNose(float lenOfNose) {
        this.lenOfNose = lenOfNose;
    }

    @Override
    public String toString() {
        return "Head{" +
                "diameter=" + diameter +
                ", baldness=" + baldness +
                ", numberOfEyes=" + numberOfEyes +
                ", numberOfEars=" + numberOfEars +
                ", lenOfNose=" + lenOfNose +
                '}';
    }
}