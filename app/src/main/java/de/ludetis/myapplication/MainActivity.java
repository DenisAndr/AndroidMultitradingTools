package de.ludetis.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class MainActivity extends AppCompatActivity {

    TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = findViewById(R.id.textView);

//        Dexter.withContext(this)
//                .withPermission("de.ludetis.myapplication.permission.USE_API")
//                .withListener(new PermissionListener() {
//                    @Override
//                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
//                        useApi();
//                    }
//
//                    @Override
//                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
//                        Toast.makeText(MainActivity.this, "Вы не дали доступ к камере, жлоб!", Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
//                        new AlertDialog.Builder(MainActivity.this)
//                                .setTitle("Свой диалог")
//                                .setMessage("Зачем давать пермишин")
//                                .setPositiveButton("Ok", (dialog, which) -> permissionToken.continuePermissionRequest()).create().show();
//                    }
//                })
//                .check();

        useApi();
    }


    private void useApi() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("de.ludetis.myapplication", "de.ludetis.myapplication.ApiActivity"));
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}