package com.example.android.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Good morning","Guten Tag",R.raw.phrase_are_you_coming));
        words.add(new Word("Hello","Hallo",R.raw.phrase_come_here));
        words.add(new Word("My name is …","Ich heiße …",R.raw.phrase_my_name_is));
        words.add(new Word("Do you speak English?","Sprechen Sie Englisch?",R.raw.phrase_how_are_you_feeling));
        words.add(new Word("What’s your name?","Wie heißt du?",R.raw.phrase_im_coming));
        words.add(new Word("How are you?","Wie geht es dir?",R.raw.phrase_im_feeling_good));
        words.add(new Word("Fine, thank you","Gut, danke",R.raw.phrase_lets_go));
        words.add(new Word("Nice to meet you","Nett, Sie kennen zu lernen",R.raw.phrase_what_is_your_name));
        words.add(new Word("Sorry, I don’t understand","Es tut mir leid, ich verstehe das nicht",R.raw.phrase_where_are_you_going));
        words.add(new Word("Goodbye","Auf Wiedersehen",R.raw.phrase_yes_im_coming));


        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.rootView3);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this,word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}