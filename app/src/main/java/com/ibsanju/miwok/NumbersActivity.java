package com.ibsanju.miwok;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public
class NumbersActivity extends AppCompatActivity {
	private static final String TAG = "NumbersActivity";

	/**
	 * This listener gets triggered when the {@link MediaPlayer} has completed
	 * playing the audio file.
	 */
	private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
		@Override
		public void onCompletion(MediaPlayer mediaPlayer) {
			// Now that the sound file has finished playing, release the media player resources.
			releaseMediaPlayer();
		}
	};

	private MediaPlayer mMediaPlayer;

	@Override
	protected
	void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.word_list);

//        ArrayList<String> words = new ArrayList<String>();
		// Create a list of words
		final ArrayList<Word> words = new ArrayList<Word>();
//        words.add("one");
//        Word W = new Word("one","lutti");
		words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
		words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
		words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
		words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
		words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
		words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
		words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
		words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
		words.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
		words.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

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

		WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
		// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
		// There should be a {@link ListView} with the view ID called list, which is declared in the
		// word_list.xml layout file.
		ListView listView = (ListView) findViewById(R.id.list);

//        GridView listView = (GridView) findViewById(R.id.list);
		listView.setAdapter(adapter);

		// Set a click listener to play the audio when the list item is clicked on
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
				// Release the media player if it currently exists because we are about to
				// play a different sound file
				releaseMediaPlayer();

				// Get the {@link Word} object at the given position the user clicked on
					Word word = words.get(position);

//					Log.d(TAG, "onItemClick: CurrentWord: " + word);
					Log.d(TAG, "CurrentWord: " + word.toString());

					// Create and setup the {@link MediaPlayer} for the audio resource associated
					// with the current word
					mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());

					// Start the audio file
					mMediaPlayer.start();


				// Setup a listener on the media player, so that we can stop and release the
				// media player once the sound has finished playing.
				mMediaPlayer.setOnCompletionListener(mCompletionListener);
				}
			});
//        Here is a list of common Type Parameters:
//
//        E - Element (used extensively by the Java Collections Framework)
//        K - Key
//        N - Number
//        T - Type
//        V - Value
//        S,U,V etc. - 2nd, 3rd, 4th types (when there is more than one parameter)
	}

	/**
	 * Clean up the media player by releasing its resources.
	 */
	private void releaseMediaPlayer() {
		// If the media player is not null, then it may be currently playing a sound.
		if (mMediaPlayer != null) {
			// Regardless of the current state of the media player, release its resources
			// because we no longer need it.
			mMediaPlayer.release();

			// Set the media player back to null. For our code, we've decided that
			// setting the media player to null is an easy way to tell that the media player
			// is not configured to play an audio file at the moment.
			mMediaPlayer = null;
		}
	}


}