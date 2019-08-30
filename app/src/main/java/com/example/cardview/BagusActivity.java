package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BagusActivity extends AppCompatActivity implements View.OnClickListener {

    Button putra, barness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagus);

        putra = findViewById(R.id.putra);
        putra.setOnClickListener(this);

        barness = findViewById(R.id.barnes1);
        barness.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.putra:
                Intent poet = new Intent(BagusActivity.this, MainActivity.class);
                startActivity(poet);
                break;
            case R.id.barnes1:
                Intent barn = new Intent(BagusActivity.this, BarnesActivity.class);
                startActivity(barn);
                break;
        }

    }
}
