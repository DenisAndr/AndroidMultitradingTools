package de.ludetis.myapplication;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;

public class MyDialog extends Dialog {

    public MyDialog(@NonNull Context context) {
        super(context);
        initDialog(context);
    }

    private void initDialog(Context context) {
        setContentView(R.layout.my_dialog);
        setCancelable(true);
        findViewById(R.id.button).setOnClickListener(v -> dismiss());
    }

}
