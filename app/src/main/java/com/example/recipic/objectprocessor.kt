package com.example.recipic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

public class objectprocessor : AppCompatActivity() {
    //Initialize Variable
    ImageView imageView;
     Button btOpen;

     @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objectprocessor);

         //assign variable

         imageView = findViewById(R.id.imageview);
         btOpen = findViewById(R.id.bt_open);

       //request cam permission
         if (ContextCompat.checkSelfPermission(context: objectprocessor.this,
         Manifest.permission.CAMERA) != PackageManager.);
    };
}