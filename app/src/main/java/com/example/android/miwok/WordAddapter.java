package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adrian on 7/26/2017.
 */

public class WordAddapter extends ArrayAdapter<Word> {

    public WordAddapter(Activity context, ArrayList<Word> words){
        super(context, 0 , words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView defaultLanguageTextView = (TextView) listItemView.findViewById(R.id.textView1);
        defaultLanguageTextView.setText(currentWord.getmDefaultTranslation());

        TextView miwokLanguageTextView = (TextView) listItemView.findViewById(R.id.textView2);
        miwokLanguageTextView.setText(currentWord.getmMiwokTransltion());
        return listItemView;

    }
}
