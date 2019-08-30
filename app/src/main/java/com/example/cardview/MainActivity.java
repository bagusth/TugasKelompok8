package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button bagoes, barnes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bagoes = findViewById(R.id.bagoes);
        bagoes.setOnClickListener(this);

        barnes = findViewById(R.id.barnes);
        barnes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bagoes:
                Intent intent = new Intent(MainActivity.this, BagusActivity.class);
                startActivity(intent);
                break;

            case R.id.barnes:
                Intent intent1 = new Intent(MainActivity.this, BarnesActivity.class);
                startActivity(intent1);
                break;
        }

    }
}
