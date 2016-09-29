package com.example.jano.botoncitos;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiaFondo(View v){
    View contenedor=v.getRootView();

        int colorcillo;
        switch (v.getId()){

            case R.id.btnamarillo:
                colorcillo = Color.parseColor("#F3F781");
                break;
            case R.id.btnazul:
                colorcillo = Color.parseColor("#A9E2F3");
                break;
            case R.id.btnrojo:
                colorcillo = Color.parseColor("#F78181");
                break;
            case R.id.btnverde:
                colorcillo = Color.parseColor("#BEF781");
                break;
            default:
                colorcillo=Color.WHITE;
            }
contenedor.setBackgroundColor(colorcillo);

        }

    }

