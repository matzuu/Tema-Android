package com.example.bogdan.temaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activitatea2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitatea2);

        Intent intent = getIntent();
        String message = intent.getStringExtra("key");
        Toast toast=Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG);
    }

    public void fIntoarcere(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        
        finish();
    }
}
