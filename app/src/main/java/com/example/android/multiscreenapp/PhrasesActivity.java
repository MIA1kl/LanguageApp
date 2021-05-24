package com.example.android.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Good morning","Guten Tag"));
        words.add(new Word("Hello","Hallo"));
        words.add(new Word("My name is …","Ich heiße …"));
        words.add(new Word("Do you speak English?","Sprechen Sie Englisch?"));
        words.add(new Word("What’s your name?","Wie heißt du?"));
        words.add(new Word("How are you?","Wie geht es dir?"));
        words.add(new Word("Fine, thank you","Gut, danke"));
        words.add(new Word("Nice to meet you","Nett, Sie kennen zu lernen"));
        words.add(new Word("Sorry, I don’t understand","Es tut mir leid, ich verstehe das nicht"));
        words.add(new Word("Goodbye","Auf Wiedersehen"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.rootView3);

        listView.setAdapter(adapter);
    }
}