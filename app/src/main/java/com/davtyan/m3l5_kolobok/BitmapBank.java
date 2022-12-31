package com.davtyan.m3l5_kolobok;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;

public class BitmapBank {
    Bitmap background;
    Bitmap[] kolobok;


    public BitmapBank(Resources resources) {
        background = BitmapFactory.decodeResource(resources, R.drawable.les2);
        background = scaleImage(background);
        kolobok = new Bitmap[4];
        kolobok[0] = BitmapFactory.decodeResource(resources, R.drawable.kolobok0);
        kolobok[1] = BitmapFactory.decodeResource(resources, R.drawable.kolobok0);
        kolobok[2] = BitmapFactory.decodeResource(resources, R.drawable.kolobok0);
        kolobok[3] = BitmapFactory.decodeResource(resources, R.drawable.kolobok0);
    }

    public Bitmap getKolobok(int frame) {
        Matrix matrix = new Matrix();
        int width = AppConstants.getBitmapBank().getKolobokWidth();
        int height = AppConstants.getBitmapBank().getKolobokHeight();
        final Bitmap outputBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        final Path path = new Path();
        path.addCircle(
                (float)(width / 2)
                , (float)(height / 2)
                , (float) Math.min(width, (height / 2))
                , Path.Direction.CCW);
        final Canvas canvas = new Canvas(outputBitmap);
        canvas.clipPath(path);
        canvas.rotate((float) (frame*4),width/2,height/2);
        canvas.drawBitmap(kolobok[1], 0, 0, null);
        Bitmap.createBitmap(outputBitmap, 0, 0, outputBitmap.getWidth(), outputBitmap.getHeight(), matrix, true);
        return outputBitmap;
    }

    public int getKolobokWidth() {
        return kolobok[0].getWidth();
    }

    public int getKolobokHeight() {
        return kolobok[0].getWidth();
    }

    public Bitmap getBackground() {
        return background;
    }

    public int getBackgroundWidth() {
        return background.getWidth();
    }

    public int getBackgroundHeight() {
        return background.getHeight();
    }

    public Bitmap scaleImage(Bitmap bitmap) {
        float widthHeightRatio = getBackgroundWidth() / getBackgroundHeight();
        int backgroundScaledWidth = (int) widthHeightRatio * AppConstants.SCREEN_HEIGHT;
        return Bitmap.createScaledBitmap(bitmap, backgroundScaledWidth, AppConstants.SCREEN_HEIGHT, false);
    }

}
