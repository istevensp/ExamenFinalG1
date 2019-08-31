package com.example.steven.examenfinalG1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.estudiante.examenfinalG1SS.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buscarHeroe(View view ){
        final TextView busqueda = (TextView) findViewById(R.id.txtBusquedaH);
        Intent manejoDeHeroes = new Intent(getBaseContext(), ManejoHeroes.class);
        manejoDeHeroes.putExtra("idheroe", busqueda.getText().toString());
        startActivity(manejoDeHeroes);
    }

}
