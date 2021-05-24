package com.example.android.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","Vater",R.drawable.family_father,R.raw.family_father));
        words.add(new Word("mother","Mutter",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("son","Sohn",R.drawable.family_son,R.raw.family_son));
        words.add(new Word("daughter","Tochter",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("brother","Bruder",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Word("sister","Schwester",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("siblings","Geschwister",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("child","Kind",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("grandmother","Großmutter",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("grandfather","Großvater",R.drawable.family_grandfather,R.raw.family_grandfather));


        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.rootView1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this,word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });

    }
}