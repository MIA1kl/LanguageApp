package com.example.android.multiscreenapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter  extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context,0, words);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView germanTextView = (TextView) listItemView.findViewById(R.id.german_text_view);
        germanTextView.setText(currentWord.getGermanTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
