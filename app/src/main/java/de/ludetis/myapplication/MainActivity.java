package de.ludetis.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Dialog;
import android.app.LoaderManager;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Loader;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import de.ludetis.myapplication.view.ColoredBackgroundTextView;

public class MainActivity extends AppCompatActivity {

    TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        viewById = findViewById(R.id.textView);

//        registerForContextMenu(viewById);


//        ColoredBackgroundTextView coloredBackgroundTextView = findViewById(R.id.coloredBackgroundTextView);

//        Toast toast = Toast.makeText(this, "Текст для тоста!", Toast.LENGTH_SHORT);
//        toast.show();

//        Snackbar.make(findViewById(R.id.root_view), "Текст для тоста!", Snackbar.LENGTH_LONG).show();



//        AlertDialog.Builder builder = new AlertDialog.Builder(this)
//                .setTitle("Title of dialog")
//                .setMessage("Message of Dialog")
//                .setIcon(R.mipmap.ic_launcher)
////                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
////                    @Override
////                    public void onClick(DialogInterface dialog, int which) {
////                        dialog.dismiss();
////                        Toast toast = Toast.makeText(MainActivity.this, "Вы нажали НЕТ!", Toast.LENGTH_SHORT);
////                        toast.show();
////                    }
////                })
//                .setPositiveButton("Принял", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.dismiss();
//                        Toast toast = Toast.makeText(MainActivity.this, "Вы нажали Принял!", Toast.LENGTH_SHORT);
//                        toast.show();
//                    }
//                })
//                .setOnCancelListener(new DialogInterface.OnCancelListener() {
//                    @Override
//                    public void onCancel(DialogInterface dialog) {
//                        Toast toast = Toast.makeText(MainActivity.this, "Диалог был отменен!", Toast.LENGTH_SHORT);
//                        toast.show();
//                    }
//                })
//                .setCancelable(false);
//
//        AlertDialog alertDialog = builder.create();
//
//        alertDialog.show();


//        MyDialog myDialog = new MyDialog(this);
//        myDialog.show();

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.my_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.menu_about :
//                Toast.makeText(this, "Вы выбрали " + item.getTitle(), Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.menu_check_update :
//                Toast.makeText(this, "Вы нажали " + item.getTitle(), Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.menu_donat :
//                Toast.makeText(this, "Вы тапнули " + item.getTitle(), Toast.LENGTH_SHORT).show();
//                return true;
//
//            default: return super.onOptionsItemSelected(item);
//        }
//    }


//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        menu.add(Menu.NONE, 0, Menu.NONE, "Пункт 0");
//        menu.add(Menu.NONE, 1, Menu.NONE, "Пункт 1");
//        menu.add(Menu.NONE, 2, Menu.NONE, "Пункт 2");
//        menu.add(Menu.NONE, 3, Menu.NONE, "Пункт 3");
//    }
//
//    @Override
//    public boolean onContextItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case 0 :
//                Toast.makeText(this, "Вы выбрали " + item.getTitle(), Toast.LENGTH_SHORT).show();
//                return true;
//            case 1 :
//                Toast.makeText(this, "Вы нажали " + item.getTitle(), Toast.LENGTH_SHORT).show();
//                return true;
//            case 2 :
//                Toast.makeText(this, "Вы тапнули " + item.getTitle(), Toast.LENGTH_SHORT).show();
//                return true;
//            case 3 :
//                Toast.makeText(this, "Вы ткнули " + item.getTitle(), Toast.LENGTH_SHORT).show();
//                return true;
//
//            default: return super.onOptionsItemSelected(item);
//        }
//    }
}