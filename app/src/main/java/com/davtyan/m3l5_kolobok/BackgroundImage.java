package com.davtyan.m3l5_kolobok;

public class BackgroundImage {
    private int backgroundImageX;
    private int backgroundImageY;
    private int backgroundImageVelocity;

    public BackgroundImage() {
        backgroundImageX = 0;
        backgroundImageY = 0;
        backgroundImageVelocity = 10;
    }

    public int getX() {
        return backgroundImageX;
    }

    public int setX(int backgroundImageX) {
        return this.backgroundImageX = backgroundImageX;
    }

    public int getY() {
        return backgroundImageY;
    }

    public int setY(int backgroundImageY) {
        return this.backgroundImageY = backgroundImageY;
    }

    public int getVelocity() {
        return backgroundImageVelocity;
    }
}
