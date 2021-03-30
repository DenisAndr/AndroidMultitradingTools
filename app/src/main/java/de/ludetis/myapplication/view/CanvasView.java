package de.ludetis.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CanvasView extends View {

    public CanvasView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        paint = new Paint();
        rect = new Rect();
        rectf = new RectF();
        points = new float[] {100, 50, 150, 100, 200, 50};
    }

    public CanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public CanvasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    Paint paint;
    Rect rect;
    RectF rectf;
    float [] points;

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawARGB(80, 102, 204, 255);

        paint.setAntiAlias(true);

        paint.setColor(Color.RED);
        paint.setStrokeWidth(10);

        canvas.drawPoint(50, 50, paint);

        paint.setColor(Color.GREEN);
        canvas.drawLine(100, 100, 500, 50, paint);

        paint.setColor(Color.BLUE);
        canvas.drawCircle(100, 200, 50, paint);


        rect.set(250, 300, 350, 500);
        canvas.drawRect(rect, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawPoints(points, paint);

        rectf.set(550, 150, 750, 550);

//        canvas.drawOval(rectf, paint);
//
//        rectf.offset(200, 0);
//        canvas.drawOval(rectf, paint);

        rectf.offsetTo(50, 50);
        canvas.drawOval(rectf, paint);


        paint.setColor(Color.RED);
        canvas.drawArc(rectf, 90, 215, false, paint);

        paint.setStrokeWidth(3);
        paint.setColor(Color.BLACK);
        canvas.drawLine(150, 450, 150, 800, paint);

        paint.setColor(Color.RED);
        paint.setTextSize(50);
        paint.setTextAlign(Paint.Align.CENTER);

        canvas.drawText("Text center", 150, 550, paint);

        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("Text left", 150, 650, paint);

        paint.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText("Text right", 150, 750, paint);
        invalidate();
    }

}
