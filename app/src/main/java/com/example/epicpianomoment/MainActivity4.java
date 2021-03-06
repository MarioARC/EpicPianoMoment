package com.example.epicpianomoment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner dropdown;
    private static final String[] items = new String[]{"Select Octave", "Octave 1", "Octave 2", "Octave 3", "Octave 4", "Octave 5", "Octave 6", "Octave 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        dropdown = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View v, int pos, long id)
    {
        Intent intent;
        switch(pos)
        {
            case 0:
                break;
            case 1:
                intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(intent);
                break;
            case 4:
                break;
            case 5:
                intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(MainActivity4.this, MainActivity6.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(MainActivity4.this, MainActivity7.class);
                startActivity(intent);
                break;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void click4c(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fourc);
        mp.start();
    }

    public void click4d(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fourd);
        mp.start();
    }

    public void click4e(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.foure);
        mp.start();
    }

    public void click4f(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fourf);
        mp.start();
    }

    public void click4g(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fourg);
        mp.start();
    }

    public void click4a(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.foura);
        mp.start();
    }

    public void click4b(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fourb);
        mp.start();
    }

    public void click4csharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fourcsharp);
        mp.start();
    }

    public void click4dsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fourdsharp);
        mp.start();
    }

    public void click4fsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fourfsharp);
        mp.start();
    }

    public void click4gsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fourgsharp);
        mp.start();
    }

    public void click4asharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fourasharp);
        mp.start();
    }

}