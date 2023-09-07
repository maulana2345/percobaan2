package com.naufal.tes1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();

    }

    public static void main(String[] args) {
        System.out.println("Hello World");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}