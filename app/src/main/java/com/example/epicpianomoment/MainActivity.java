package com.example.epicpianomoment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner dropdown;
    private static final String[] items = new String[]{"Select Octave", "Octave 1", "Octave 2", "Octave 3", "Octave 4", "Octave 5", "Octave 6", "Octave 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                break;
            case 2:
                intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(MainActivity.this, MainActivity6.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(MainActivity.this, MainActivity7.class);
                startActivity(intent);
                break;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void click0a(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.zeroa);
        mp.start();
    }

    public void click0b(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.zerob);
        mp.start();
    }

    public void click1c(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.onec);
        mp.start();
    }

    public void click1d(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.oned);
        mp.start();
    }

    public void click1e(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.onee);
        mp.start();
    }

    public void click1f(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.onef);
        mp.start();
    }

    public void click1g(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.oneg);
        mp.start();
    }

    public void click1a(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.onea);
        mp.start();
    }

    public void click1b(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.oneb);
        mp.start();
    }

    public void click0asharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.zeroasharp);
        mp.start();
    }

    public void click1csharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.onecsharp);
        mp.start();
    }

    public void click1dsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.onedsharp);
        mp.start();
    }

    public void click1fsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.onefsharp);
        mp.start();
    }

    public void click1gsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.onegsharp);
        mp.start();
    }

    public void click1asharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.oneasharp);
        mp.start();
    }

}