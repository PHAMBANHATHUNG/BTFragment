package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(int fontsize, String text) {
        Fragment2 textFragment = (Fragment2)getSupportFragmentManager().findFragmentById
                (R.id.second_fragment);
        textFragment.changeTextProperties(fontsize, text);
    }
}
