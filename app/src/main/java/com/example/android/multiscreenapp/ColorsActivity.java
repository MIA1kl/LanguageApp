package com.example.android.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red","rot"));
        words.add(new Word("green","grün"));
        words.add(new Word("brown","braun"));
        words.add(new Word("orange","orange"));
        words.add(new Word("yellow","gelb"));
        words.add(new Word("blue","blau"));
        words.add(new Word("purple","lila"));
        words.add(new Word("pink","rosa"));
        words.add(new Word("white","weiß"));
        words.add(new Word("black","schwarz"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.rootView2);

        listView.setAdapter(adapter);
    }
}