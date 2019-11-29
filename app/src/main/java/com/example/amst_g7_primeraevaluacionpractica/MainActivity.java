package com.example.amst_g7_primeraevaluacionpractica;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button empezar_bttn;
    public static int aciertos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        empezar_bttn= (Button) findViewById(R.id.empezar_bttn);
    }

    public void irPregunta(View view){
        Random rand= new Random();
        int n= rand.nextInt(5)+1;
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
