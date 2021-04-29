package com.example.animaciones_interpoladas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class traslacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traslacion);

        TextView tv = (TextView) findViewById(R.id.texto);

        Animation td = AnimationUtils.loadAnimation(this, R.anim.traslacion_derecha);

        td.setFillAfter(true);//Mantiene el estado de la animación(si la animacion no esta en bucle se mantendra en la posicion final), si esto esta en false, al terminar su animacion se pisicona el view es un posicion por default
        tv.startAnimation(td);//las animaciones es un metodo propio de los objetos View

        tv.append("\n Texto añadido");
    }
}