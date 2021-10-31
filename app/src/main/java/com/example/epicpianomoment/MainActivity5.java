package com.example.epicpianomoment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

}