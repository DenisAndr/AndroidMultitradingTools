package de.ludetis.myapplication.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import de.ludetis.myapplication.R;

public class RadioText extends LinearLayout {

    public RadioText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.RadioText);
        int selectBgColor = typedArray.getColor(R.styleable.RadioText_rt_selection_background_color, Color.BLUE);
        int textsCount = typedArray.getInt(R.styleable.RadioText_rt_texts_count, 3);
        typedArray.recycle();

        setOrientation(VERTICAL);

        for (int i = 0; i < textsCount; i++) {
            TextView textView = new TextView(context);
            textView.setText("TextView " + i);
            textView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    clearTextsBg();
                    v.setBackgroundColor(selectBgColor);
                }
            });

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            params.setMargins(20, 20, 20, 20);
            addView(textView, params);
        }
    }

    private void clearTextsBg() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.setBackgroundColor(Color.WHITE);
        }
    }
}
