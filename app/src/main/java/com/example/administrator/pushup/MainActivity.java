package com.example.administrator.pushup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    private void TestUpload(){
//        int i = 1+1;
//        int ii = 2+2;
//        int iii = i + ii;
//    }

    public void onButton01Clicked(View v){
        Toast.makeText(MainActivity.this, "버튼 01이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onButton02Clicked(View v){
        Toast.makeText(MainActivity.this, "버튼 02이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onButton03Clicked(View v){
        Toast.makeText(MainActivity.this, "버튼 03이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onButton04Clicked(View v){
        Toast.makeText(MainActivity.this, "버튼 04이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onButton05Clicked(View v){
        Toast.makeText(MainActivity.this, "버튼 05이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onButton06Clicked(View v){
        Toast.makeText(MainActivity.this, "버튼 06이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onButton07Clicked(View v){
        Toast.makeText(MainActivity.this, "버튼 07이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onButton08Clicked(View v){
        Toast.makeText(MainActivity.this, "버튼 08이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onButton09Clicked(View v){
        Toast.makeText(MainActivity.this, "버튼 09이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onButton10Clicked(View v){
        Toast.makeText(MainActivity.this, "버튼 10이 클릭되었습니다.", Toast.LENGTH_SHORT).show();
    }
}
