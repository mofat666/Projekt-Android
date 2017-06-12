package com.example.banskyy.jpo2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Kolo extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    float promien;
    private Spinner spinner1;
    private static final String[]paths = {"...", "Kwadrat", "Prostokąt", "Trójkąt",
            "Koło", "Trapez", "Prostopadłościan","Walec", "Stożek", "Kula", };

    public void oblicz(View view) {

        EditText editText = (EditText)findViewById(R.id.editText2);
        promien = Float.parseFloat(editText.getText().toString());
        TextView pole = (TextView)findViewById(R.id.textView4);
        pole.setText(3.14*promien*promien + "cm");
        TextView obwod = (TextView)findViewById(R.id.textView6);
        obwod.setText(2*3.14*promien + "cm");

        MediaPlayer mp = MediaPlayer.create(this, R.raw.sms);
        mp.start();

        Toast.makeText(getApplicationContext(), "Obliczono!", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolo);

        spinner1 = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,paths);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {


        switch (pos) {

            case 0:

                break;

            case 1:

                Intent kwadrat = new Intent(this, Kwadrat.class);
                startActivity(kwadrat);
                break;

            case 2:

                Intent prostokat = new Intent(this, Prostokat.class);
                startActivity(prostokat);
                break;

            case 3:

                Intent trojkat = new Intent(this, Trojkat.class);
                startActivity(trojkat);
                break;

            case 4:

                Intent kolo = new Intent(this, Kolo.class);
                startActivity(kolo);
                break;

            case 5:

                Intent trapez = new Intent(this, Trapez.class);
                startActivity(trapez);
                break;

            case 6:

                Intent prostopadloscian = new Intent(this, Prostopadloscian.class);
                startActivity(prostopadloscian);
                break;

            case 7:

                Intent walec = new Intent(this, Walec.class);
                startActivity(walec);
                break;


            case 8:

                Intent stozek = new Intent(this, Stozek.class);
                startActivity(stozek);
                break;

            case 9:

                Intent kula = new Intent(this, Kula.class);
                startActivity(kula);
                break;
        }
    }


    public void onNothingSelected(AdapterView<?> parent) {
    }
}