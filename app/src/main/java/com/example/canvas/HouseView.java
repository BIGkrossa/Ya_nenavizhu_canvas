package com.example.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

public class HouseView extends View {

    public HouseView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawRect(100, 300, 600, 800, paint);

        Path roofPath = new Path();
        roofPath.moveTo(100, 300);
        roofPath.lineTo(350, 100);
        roofPath.lineTo(600, 300);
        roofPath.close();
        paint.setColor(Color.RED);
        canvas.drawPath(roofPath, paint);

        paint.setColor(Color.WHITE);
        int windowWidth = 80;
        int windowHeight = 100;
        int windowGap = 40;
        int windowX = 150;
        int windowY = 450;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                canvas.drawRect(windowX + (windowWidth + windowGap) * i, windowY + (windowHeight + windowGap) * j, windowX + (windowWidth + windowGap) * i + windowWidth, windowY + (windowHeight + windowGap) * j + windowHeight, paint);
            }
        }

        paint.setColor(Color.WHITE);
        canvas.drawRect(400, 600, 525, 800, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(100, 100, 50, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(0, 800, getWidth(), getHeight(), paint);
    }
}
