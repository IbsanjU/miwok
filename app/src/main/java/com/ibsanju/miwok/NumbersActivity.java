package com.ibsanju.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public
class NumbersActivity extends AppCompatActivity {

	@Override
	protected
	void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_numbers);

//        ArrayList<String> words = new ArrayList<String>();
		// Create a list of words
		ArrayList<Word> words = new ArrayList<Word>();
//        words.add("one");
//        Word W = new Word("one","lutti");
		words.add(new Word("one","lutti"));
		words.add(new Word("two","otiiko"));
		words.add(new Word("three", "tolookosu"));
		words.add(new Word("four", "oyyisa"));
		words.add(new Word("five", "massokka"));
		words.add(new Word("six","temmokka"));
		words.add(new Word("seven","kenekaku"));
		words.add(new Word("eight","kawinta"));
		words.add(new Word("nine","wo’e"));
		words.add(new Word("ten","na’aacha"));

//    LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

//        // Create a variable to keep track of the current index position
//        int index = 0;
//
//        // Keep looping until we've reached the end of the list (which means keep looping
//        // as long as the current index position is less than the length of the list)
//        while(index<words.size()) {
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//
//            // Set the text to be word at the current index
//            wordView.setText(words.get(index));
//
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//
//            // Increment the index variable by 1
//            index++;
//        }

//        for (int index = 0; index< words.size(); index++){
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//
//            // Set the text to be word at the current index
//            wordView.fsetText(words.get(index));
//
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//        }

		WordAdapter adapter = new WordAdapter(this, words);
		// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
		// There should be a {@link ListView} with the view ID called list, which is declared in the
		// word_list.xml layout file.
		ListView listView = (ListView) findViewById(R.id.list);

//        GridView listView = (GridView) findViewById(R.id.list);
		listView.setAdapter(adapter);

//        Here is a list of common Type Parameters:
//
//        E - Element (used extensively by the Java Collections Framework)
//        K - Key
//        N - Number
//        T - Type
//        V - Value
//        S,U,V etc. - 2nd, 3rd, 4th types (when there is more than one parameter)
	}
}