package com.example.neodestiny.promedioipchile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class actividadProm_Final extends AppCompatActivity {

    private EditText et_promfin, et_examen;
    private Button btn_calcular;
    DecimalFormat df = new DecimalFormat("#.#");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_prom__final);

        et_promfin=findViewById(R.id.et_promfin);
        et_examen=findViewById(R.id.et_examen);

    }

    public void calcularPromFin (View v)
    {
        double prom=Double.parseDouble(et_promfin.getText().toString());
        double examen=Double.parseDouble(et_examen.getText().toString());

        double resultado=(prom*0.7)+(examen*0.3);
        Toast.makeText(getApplicationContext(),"Promedio final: "+df.format(resultado),Toast.LENGTH_SHORT).show();



    }
}
