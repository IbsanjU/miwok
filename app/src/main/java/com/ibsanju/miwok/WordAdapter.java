package com.ibsanju.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public
class WordAdapter extends ArrayAdapter<Word> {
    private static final String TAG = "WordAdapter";


public WordAdapter(Activity context, ArrayList<Word> words) { super(context, 0, words); }

    @Override
    public
    View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        // =================================================
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        // get the object located at thtis position in the list
        Word currentWord = getItem(position);

        //Find TextView in the list_item.xml with ID
        // Get the miwokTreanslation from theWord.java Object and set Text on the mMiwokTranslation
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // =================================================
//        return super.getView(position, convertView, parent);
        return listItemView;
    }
}
