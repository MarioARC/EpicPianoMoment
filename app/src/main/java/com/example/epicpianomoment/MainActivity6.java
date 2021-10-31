package com.example.epicpianomoment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity6 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner dropdown;
    private static final String[] items = new String[]{"Select Octave", "Octave 1", "Octave 2", "Octave 3", "Octave 4", "Octave 5", "Octave 6", "Octave 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

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
                intent = new Intent(MainActivity6.this, MainActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity6.this, MainActivity2.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity6.this, MainActivity3.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity6.this, MainActivity4.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(intent);
                break;
            case 6:
                break;
            case 7:
                intent = new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(intent);
                break;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void click6c(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixc);
        mp.start();
    }

    public void click6d(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixd);
        mp.start();
    }

    public void click6e(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixe);
        mp.start();
    }

    public void click6f(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixf);
        mp.start();
    }

    public void click6g(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixg);
        mp.start();
    }

    public void click6a(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixa);
        mp.start();
    }

    public void click6b(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixb);
        mp.start();
    }

    public void click6csharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixcsharp);
        mp.start();
    }

    public void click6dsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixdsharp);
        mp.start();
    }

    public void click6fsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixfsharp);
        mp.start();
    }

    public void click6gsharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixgsharp);
        mp.start();
    }

    public void click6asharp(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sixasharp);
        mp.start();
    }

}