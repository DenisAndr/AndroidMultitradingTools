package de.ludetis.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LoaderManager;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Loader;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {

    TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewById = findViewById(R.id.textView);

//        FileLoader fileLoader = new FileLoader();
//        fileLoader.execute("http://mysyte.com/settings.json");

        viewById.setText("Start loading...");
        getLoaderManager().initLoader(1, null, this);
        getLoaderManager().initLoader(2, null, this);

        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getLoaderManager().restartLoader(2, null, MainActivity.this);
            }
        });

    }

    @Override
    public Loader<String> onCreateLoader(int id, Bundle args) {
        return new FileLoader(id, getApplicationContext());
    }

    @Override
    public void onLoadFinished(Loader<String> loader, String data) {
        viewById.setText(data);
    }

    @Override
    public void onLoaderReset(Loader<String> loader) {

    }

    private static class FileLoader extends AsyncTaskLoader<String> {
        private final int id;

        public FileLoader(int id, Context context) {
            super(context);
            this.id = id;
        }

        @Override
        public String loadInBackground() {

            downloadingFile();

            return "Загруженные данные с сервера. id = " + id;
        }

        void downloadingFile() {
            for (int i = 0; i <= 100; i++) {
                downloadPart(i);
            }
        }

        private void downloadPart(int i) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void onStartLoading() {
            super.onStartLoading();
            forceLoad();
        }

        @Override
        protected void onForceLoad() {
            super.onForceLoad();
        }
    }


//    class FileLoader extends AsyncTask<String, Integer, String> {
//
//        private void downloadPart(int i) {
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//            viewById.setText("Start loading...");
//        }
//
//        void downloadingFile() {
//            for (int i = 0; i <= 100; i++) {
//                downloadPart(i);
//                publishProgress(i);
//            }
//        }
//
//        @Override
//        protected String doInBackground(String... strings) {
//            downloadingFile();
//            return "Загруженные данные с сервера по аддресу " + strings[0];
//        }
//
//        @Override
//        protected void onProgressUpdate(Integer... values) {
//            super.onProgressUpdate(values);
//            viewById.setText("Loaded " + values[0] + "%");
//        }
//
//        @Override
//        protected void onPostExecute(String s) {
//            super.onPostExecute(s);
//            viewById.setText(s);
//        }
//    }

}