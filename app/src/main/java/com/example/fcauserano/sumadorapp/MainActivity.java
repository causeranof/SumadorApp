package com.example.fcauserano.sumadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewNumber = findViewById(R.id.text_view_number);
    }

    public void clickSumar(View view) {
        Integer valorNumero = Integer.parseInt(textViewNumber.getText().toString());
        valorNumero ++;
        textViewNumber.setText(valorNumero.toString());
    }

    public void clickRestar(View view) {
        Integer valorNumero = Integer.parseInt(textViewNumber.getText().toString());
        if(valorNumero>0){
            valorNumero --;
            textViewNumber.setText(valorNumero.toString());
        }else {
            Toast.makeText(this, "A donde vas? Ya estamos en 0!!!", Toast.LENGTH_LONG).show();
        }
    }
}
