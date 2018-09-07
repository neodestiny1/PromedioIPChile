package com.example.neodestiny.promedioipchile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class actividadExamen extends AppCompatActivity {

    private EditText et_nota;
    private Button btn_calcular;
    DecimalFormat df = new DecimalFormat("#.#");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_examen);
        et_nota = findViewById(R.id.et_nota);
        btn_calcular = findViewById(R.id.btn_calcular);
    }

    public void calcularNota(View v)
    {
        double resultado, nota=Double.parseDouble(et_nota.getText().toString());
        resultado=(4-nota)/0.3;
        Toast.makeText(getApplicationContext(),"La nota mínima de aprobación es de: "+df.format(resultado),Toast.LENGTH_SHORT).show();
    }
}
