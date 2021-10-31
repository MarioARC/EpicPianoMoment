package com.example.epicpianomoment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity5 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner dropdown;
    private static final String[] items = new String[]{"Select Octave", "Octave 1", "Octave 2", "Octave 3", "Octave 4", "Octave 5", "Octave 6", "Octave 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

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
                intent = new Intent(MainActivity5.this, MainActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity5.this, MainActivity2.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity5.this, MainActivity3.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(intent);
                break;
            case 5:
                break;
            case 6:
                intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(MainActivity5.this, MainActivity7.class);
                startActivity(intent);
                break;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void click5c(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fivec);
        mp.start();
    }

    public void click5d(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fived);
        mp.start();
    }

    public void click5e(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fivee);
        mp.start();
    }

    public void click5f(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fivef);
        mp.start();
    }

    public void click5g(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fiveg);
        mp.start();
    }

    public void click5a(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fivea);
        mp.start();
    }

    public void click5b(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fiveb);
        mp.start();
    }

    public void click5csharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fivecsharp);
        mp.start();
    }

    public void click5dsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fivedsharp);
        mp.start();
    }

    public void click5fsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fivefsharp);
        mp.start();
    }

    public void click5gsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fivegsharp);
        mp.start();
    }

    public void click5asharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fiveasharp);
        mp.start();
    }

}