package com.example.amst_g7_primeraevaluacionpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Pregunta1 extends AppCompatActivity {
    Button op1, op2, op3, op4;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);
        op1= (Button) findViewById(R.id.yafue_bttn);
        op2= (Button) findViewById(R.id.vida_bttn);
        op3= (Button) findViewById(R.id.hakuna_bttn);
        op4= (Button) findViewById(R.id.forma_bttn);
    }
    public void perder(View view){
        Intent tof1=new Intent(this,Perder.class);
        startActivity(tof1);
        finish();
    }
    public void continuar(View view){

        int n;
        do {
            Random rand = new Random();
            n = rand.nextInt(5) + 1;
        }while(n==1);


        switch (n) {
            case 1:
                Intent toPregunta1= new Intent(this,Pregunta1.class);
                startActivity(toPregunta1);
                finish();
                break;
            case 2:
                Intent toPregunta2= new Intent(this,Pregunta2.class);
                startActivity(toPregunta2);
                finish();
                break;
            case 3:
                Intent toPregunta3= new Intent(this,Pregunta3.class);
                startActivity(toPregunta3);
                finish();
                break;
            case 4:
                Intent toPregunta4= new Intent(this,Pregunta4.class);
                startActivity(toPregunta4);
                finish();
                break;
            case 5:
                Intent toPregunta5= new Intent(this,Pregunta5.class);
                startActivity(toPregunta5);
                finish();
                break;
        }

    }
}
