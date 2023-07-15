package edu.utec.practicalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Bienvenida extends AppCompatActivity {

    public TextView usuarioLogueado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        Intent intent = getIntent();
        String usuario = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        usuarioLogueado =  findViewById(R.id.txtUsuarioLogueado);
        usuarioLogueado.setText(usuario);
    }
}