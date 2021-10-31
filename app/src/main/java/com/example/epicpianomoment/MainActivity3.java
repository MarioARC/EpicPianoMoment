package com.example.epicpianomoment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner dropdown;
    private static final String[] items = new String[]{"Select Octave", "Octave 1", "Octave 2", "Octave 3", "Octave 4", "Octave 5", "Octave 6", "Octave 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

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
                intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
                break;
            case 3:
                break;
            case 4:
                intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(MainActivity3.this, MainActivity6.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(MainActivity3.this, MainActivity7.class);
                startActivity(intent);
                break;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void click3c(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threec);
        mp.start();
    }

    public void click3d(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threed);
        mp.start();
    }

    public void click3e(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threee);
        mp.start();
    }

    public void click3f(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threef);
        mp.start();
    }

    public void click3g(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threeg);
        mp.start();
    }

    public void click3a(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threea);
        mp.start();
    }

    public void click3b(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threeb);
        mp.start();
    }

    public void click3csharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threecsharp);
        mp.start();
    }

    public void click3dsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threedsharp);
        mp.start();
    }

    public void click3fsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threefsharp);
        mp.start();
    }

    public void click3gsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threegsharp);
        mp.start();
    }

    public void click3asharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.threeasharp);
        mp.start();
    }

}