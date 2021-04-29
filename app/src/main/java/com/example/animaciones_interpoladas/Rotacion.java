package com.example.animaciones_interpoladas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Rotacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotacion);

        TextView tv = (TextView) findViewById(R.id.texto);

        Animation td = AnimationUtils.loadAnimation(this, R.anim.rotacion);

        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(5);
        tv.startAnimation(td);//las animaciones es un metodo propio de los objetos View

        tv.append("\n Texto añadido");
    }
}