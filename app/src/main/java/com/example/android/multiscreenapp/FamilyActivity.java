package com.example.android.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","Vater"));
        words.add(new Word("mother","Mutter"));
        words.add(new Word("son","Sohn"));
        words.add(new Word("daughter","Tochter"));
        words.add(new Word("brother","Bruder"));
        words.add(new Word("sister","Schwester"));
        words.add(new Word("siblings","Geschwister"));
        words.add(new Word("child","Kind"));
        words.add(new Word("grandmother","Großmutter"));
        words.add(new Word("grandfather","Großvater"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.rootView1);

        listView.setAdapter(adapter);

    }
}