package de.ludetis.myapplication.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

import de.ludetis.myapplication.R;

@SuppressLint("AppCompatCustomView")
public class ColoredBackgroundTextView extends TextView {

    public ColoredBackgroundTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColoredBackgroundTextView);
        int bgColor = typedArray.getColor(R.styleable.ColoredBackgroundTextView_cbtv_background_color, Color.WHITE);
        typedArray.recycle();
        super.setBackgroundColor(bgColor);
    }

    @Override
    public void setBackgroundColor(int color) {
//        super.setBackgroundColor(color);
    }
}
