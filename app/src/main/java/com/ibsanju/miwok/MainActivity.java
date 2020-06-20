package com.ibsanju.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public
class MainActivity extends AppCompatActivity {

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openNumbersList(View v) {
        // TODO: Write your code here!
        Intent i = new Intent(MainActivity.this, NumbersActivity.class);
        startActivity(i);
    }
    public void openColorsList(View v) {
        // TODO: Write your code here!
        Intent i = new Intent(MainActivity.this, ColorsActivity.class);
        startActivity(i);
    }
    public void openFamilyList(View v) {
        // TODO: Write your code here!
        Intent i = new Intent(MainActivity.this, FamilyActivity.class);
        startActivity(i);
    }
    public void openPhrasesList(View v) {
        // TODO: Write your code here!
        Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
        startActivity(i);
    }


}