package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BarnesActivity extends AppCompatActivity implements View.OnClickListener {

    Button poet, goes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barnes);

        poet = findViewById(R.id.putra1);
        poet.setOnClickListener(this);

        goes = findViewById(R.id.bagoess);
        goes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.putra1:
                Intent put = new Intent(BarnesActivity.this, MainActivity.class);
                startActivity(put);
                break;
            case R.id.bagoess:
                Intent gus = new Intent(BarnesActivity.this, BagusActivity.class);
                break;
        }

    }
}
