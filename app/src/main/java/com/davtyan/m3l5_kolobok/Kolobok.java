package com.davtyan.m3l5_kolobok;

public class Kolobok {
    private int kolobokX;
    private int kolobokY;
    private int currentFrame;
    private int velocity;
    public static int maxFrame;

    public Kolobok() {
        kolobokX = AppConstants.SCREEN_WIDTH/2 - AppConstants.getBitmapBank().getKolobokWidth()/2;
        kolobokY = AppConstants.SCREEN_HEIGHT/2 - AppConstants.getBitmapBank().getKolobokHeight()/2;
        currentFrame = 0;
        maxFrame = 180;
        velocity = 0;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    public int getX() {
        return kolobokX;
    }

    public void setX(int x) {
        kolobokX = x;
    }

    public int getY() {
        return kolobokY;
    }

    public void setY(int y) {
        kolobokY = y;
    }

}
