package com.example.neodestiny.promedioipchile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class actividadEva extends AppCompatActivity {

    private EditText et_eva1, et_eva2, et_eva3, et_eva4;
    private Button btn_calcular;
    DecimalFormat df = new DecimalFormat("#.#");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_eva);

        et_eva1 = findViewById(R.id.et_eva1);
        et_eva2 = findViewById(R.id.et_eva2);
        et_eva3 = findViewById(R.id.et_eva3);
        et_eva4 = findViewById(R.id.et_eva4);
    }

    public void calcularPromedio (View v)
    {
        String mensaje="";
        double promedio, eva1 = Double.parseDouble(et_eva1.getText().toString()),
                eva2 = Double.parseDouble(et_eva2.getText().toString()),
                eva3 = Double.parseDouble(et_eva3.getText().toString()),
                eva4 = Double.parseDouble(et_eva4.getText().toString());
        promedio=(eva1+eva2+eva3+eva4)/4;

        if (eva1<4 || eva2<4 || eva3<4 || eva4<4)
        {
            mensaje="Debes dar examen por tener una(s) nota(s) menor a 4.0 en evas ";
        }else{
            mensaje="No tienes notas rojas en eva, verificar el promedio de notas";
        }

        Toast.makeText(getApplicationContext(),"El promedio de las eva es de : "+ df.format(promedio)+". "+mensaje, Toast.LENGTH_SHORT).show();
    }
}
