package com.example.banskyy.jpo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EkranWyboru extends AppCompatActivity {

    public void click(View view) {

        switch(view.getId()) {

            case R.id.kwadrat:

            Intent kwadrat = new Intent(EkranWyboru.this, Kwadrat.class);
            startActivity(kwadrat);
                break;

            case R.id.prostokat:

            Intent prostokat = new Intent(EkranWyboru.this, Prostokat.class);
            startActivity(prostokat);
                break;

            case R.id.trojkat:

                Intent trojkat = new Intent(EkranWyboru.this, Trojkat.class);
                startActivity(trojkat);
                break;

            case R.id.kolo:

                Intent kolo = new Intent(EkranWyboru.this, Kolo.class);
                startActivity(kolo);
                break;

            case R.id.prostopadloscian:

                Intent prostopadloscian = new Intent(EkranWyboru.this, Prostopadloscian.class);
                startActivity(prostopadloscian);
                break;

            case R.id.trapez:

                Intent trapez = new Intent(EkranWyboru.this, Trapez.class);
                startActivity(trapez);
                break;

            case R.id.stozek:

                Intent stozek = new Intent(EkranWyboru.this, Stozek.class);
                startActivity(stozek);
                break;

            case R.id.kula:

                Intent kula = new Intent(EkranWyboru.this, Kula.class);
                startActivity(kula);
                break;

            case R.id.walec:

                Intent walec = new Intent(EkranWyboru.this, Walec.class);
                startActivity(walec);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran_wyboru);
    }
}
