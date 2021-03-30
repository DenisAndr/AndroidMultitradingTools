package de.ludetis.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class SurfaceCanvasView extends SurfaceView implements SurfaceHolder.Callback {

    private DrawThread drawThread;

    public SurfaceCanvasView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        getHolder().addCallback(this);
    }

    public SurfaceCanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public SurfaceCanvasView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        drawThread = new DrawThread(getHolder());
        drawThread.start();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {
        drawThread.interrupt();
    }

    class DrawThread extends Thread {

        private final SurfaceHolder holder;

        public DrawThread(SurfaceHolder holder) {
            this.holder = holder;
        }

        @Override
        public void run() {
            Canvas canvas = null;
            while (!isInterrupted()) {
                try {

                    canvas = holder.lockCanvas(null);

                    if (canvas != null) {
                        canvas.drawColor(Color.GREEN);
                    } else {
                        continue;
                    }

                } finally {
                    if (canvas != null) {
                        holder.unlockCanvasAndPost(canvas);
                    }
                    canvas = null;
                }
            }
        }
    }

}
