package com.ibsanju.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public
class MainActivity extends AppCompatActivity {

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the view that shows thw numbers category
        TextView numbers = findViewById(R.id.numbers);

        // Set a clicklistener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public
            void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);
            }
        });
    }

    public
    void openNumbersList(View v) {
        // TODO: Write your code here!
        // Create a new intent to open the {@link NumbersActivity}
//        Intent i = new Intent(MainActivity.this, NumbersActivity.class);
        // Start new Activity
//        startActivity(i);
    }

    public
    void openColorsList(View v) {
        // TODO: Write your code here!
        Intent i = new Intent(MainActivity.this, ColorsActivity.class);
        startActivity(i);
    }

    public
    void openFamilyList(View v) {
        // TODO: Write your code here!
        Intent i = new Intent(MainActivity.this, FamilyActivity.class);
        startActivity(i);
    }

    public
    void openPhrasesList(View v) {
        // TODO: Write your code here!
        Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
        startActivity(i);
    }


}