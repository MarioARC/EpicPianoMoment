package com.example.epicpianomoment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner dropdown;
    private static final String[] items = new String[]{"Select Octave", "Octave 1", "Octave 2", "Octave 3", "Octave 4", "Octave 5", "Octave 6", "Octave 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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
                intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                break;
            case 2:
                break;
            case 3:
                intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(MainActivity2.this, MainActivity6.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(MainActivity2.this, MainActivity7.class);
                startActivity(intent);
                break;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void click2c(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twoc);
        mp.start();
    }

    public void click2d(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twod);
        mp.start();
    }

    public void click2e(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twoe);
        mp.start();
    }

    public void click2f(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twof);
        mp.start();
    }

    public void click2g(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twog);
        mp.start();
    }

    public void click2a(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twoa);
        mp.start();
    }

    public void click2b(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twob);
        mp.start();
    }

    public void click2csharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twocsharp);
        mp.start();
    }

    public void click2dsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twodsharp);
        mp.start();
    }

    public void click2fsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twofsharp);
        mp.start();
    }

    public void click2gsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twogsharp);
        mp.start();
    }

    public void click2asharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.twoasharp);
        mp.start();
    }
}