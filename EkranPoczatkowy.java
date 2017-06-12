package com.example.banskyy.jpo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EkranPoczatkowy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran_poczatkowy);
    }

    public void click(View view) {

        Intent intent = new Intent(EkranPoczatkowy.this, EkranStartu.class);
        startActivity(intent);
    }
}
