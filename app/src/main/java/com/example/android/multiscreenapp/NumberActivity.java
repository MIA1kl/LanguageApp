package com.example.android.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","eins",R.drawable.number_one,R.raw.num_one));
        words.add(new Word("two","zwei",R.drawable.number_two,R.raw.num_two));
        words.add(new Word("three","drei",R.drawable.number_three,R.raw.num_three));
        words.add(new Word("four","vier",R.drawable.number_four,R.raw.num_four));
        words.add(new Word("five","fünf",R.drawable.number_five,R.raw.num_five));
        words.add(new Word("six","sechs",R.drawable.number_six,R.raw.num_six));
        words.add(new Word("seven","sieben",R.drawable.number_seven,R.raw.num_seven));
        words.add(new Word("eight","acht",R.drawable.number_eight,R.raw.num_eight));
        words.add(new Word("nine","neun",R.drawable.number_nine,R.raw.num_nine));
        words.add(new Word("ten","zehn",R.drawable.number_ten,R.raw.num_ten));


        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.rootView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(NumberActivity.this,word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });

    }
}