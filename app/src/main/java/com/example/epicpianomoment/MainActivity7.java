package com.example.epicpianomoment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity7 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner dropdown;
    private static final String[] items = new String[]{"Select Octave", "Octave 1", "Octave 2", "Octave 3", "Octave 4", "Octave 5", "Octave 6", "Octave 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

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
                intent = new Intent(MainActivity7.this, MainActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity7.this, MainActivity2.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity7.this, MainActivity3.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity7.this, MainActivity4.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(MainActivity7.this, MainActivity5.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(MainActivity7.this, MainActivity6.class);
                startActivity(intent);
                break;
            case 7:
                break;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void click7c(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevenc);
        mp.start();
    }

    public void click7d(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevend);
        mp.start();
    }

    public void click7e(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevene);
        mp.start();
    }

    public void click7f(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevenf);
        mp.start();
    }

    public void click7g(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.seveng);
        mp.start();
    }

    public void click7a(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevena);
        mp.start();
    }

    public void click7b(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevenb);
        mp.start();
    }

    public void click8c(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.eightc);
        mp.start();
    }

    public void click7csharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevencsharp);
        mp.start();
    }

    public void click7dsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevendsharp);
        mp.start();
    }

    public void click7fsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevenfsharp);
        mp.start();
    }

    public void click7gsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevengsharp);
        mp.start();
    }

    public void click7asharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sevenasharp);
        mp.start();
    }

}