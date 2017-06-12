package com.example.banskyy.jpo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EkranStartu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran_startu);
    }
    public void click(View view) {

        Intent intent = new Intent(EkranStartu.this, EkranWyboru.class);
        startActivity(intent);
    }
}
