package com.example.tehtava6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        int index = getIntent().getIntExtra("presidentIndex", 0);
        President president = Singleton.getInstance().list.get(index);

        ((TextView) findViewById(R.id.textViewName)).setText(president.getName());
        ((TextView) findViewById(R.id.textViewStartYear)).setText(president.getStartYear() + " - " + president.getEndYear());
        ((TextView) findViewById(R.id.textViewComment)).setText(president.getKommentti());
    }
}