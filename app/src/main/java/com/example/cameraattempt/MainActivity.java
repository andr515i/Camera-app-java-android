package com.example.cameraattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //init vars
    ImageView imageView;
    Button btOpen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign vars
        imageView = findViewById(R.id.image_view);
        btOpen = findViewById(R.id.bt_open);

        //request for camera permission
        

    }
}