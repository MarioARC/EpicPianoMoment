package com.example.epicpianomoment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner dropdown = findViewById(R.id.spinner);
        String[] items = new String[]{"Octave 1", "Octave 2", "Octave 3", "Octave 4", "Octave 5", "Octave 6", "Octave 7"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }

//    public void click(View v)
//    {
//        MediaPlayer mp = MediaPlayer.create(this, R.raw.samsung);
//        mp.start();
//    }

}