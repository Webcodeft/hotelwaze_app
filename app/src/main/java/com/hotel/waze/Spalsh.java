package com.hotel.waze;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;



public class Spalsh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Spalsh.this, MainActivity.class);
                startActivity(intent);
                finish();
           }
       }, 2000);

    }
   public void imageClick(View view) {
        Intent intent = new Intent(Spalsh.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}