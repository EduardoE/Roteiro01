package com.ufpb.eduardo.roteiro01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mBoasVindas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBoasVindas = (TextView)findViewById(R.id.bemvindo);
        Bundle b = getIntent().getExtras();
        String texto = b.getString("usuario");
        mBoasVindas.setText("Olá " + texto + "! Bem-Vindo! ");

    }
}
