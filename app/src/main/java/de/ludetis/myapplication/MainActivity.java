package de.ludetis.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.LoaderManager;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Loader;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = findViewById(R.id.textView);

        final Handler[] handler = new Handler[1];

        new Thread("ServerThread") {
            @Override
            public void run() {
                Looper.prepare();
                handler[0] = new Handler(){
                    @Override
                    public void dispatchMessage(@NonNull Message msg) {
                        super.dispatchMessage(msg);
                    }

                    @Override
                    public void handleMessage(@NonNull Message msg) {
                        super.handleMessage(msg);
                    }
                };
                Looper.loop();
            }
        }.start();


        new Thread("ClientThread") {
            @Override
            public void run() {

                while (true) {

                    if (handler[0] != null) {
                        Message message = new Message();
                        message.obj = "Данные";
                        handler[0].sendMessage(message);
                    }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }.start();

    }

}