package com.example.administrator.pushup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu08Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu08);
    }
    public void onButton1Clicked(View v){
        finish();
    }
}
