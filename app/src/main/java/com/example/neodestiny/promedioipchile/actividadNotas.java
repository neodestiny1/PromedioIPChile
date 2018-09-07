package com.example.neodestiny.promedioipchile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class actividadNotas extends AppCompatActivity {

    private EditText et_epr1, et_epe1, et_epr2, et_epe2, et_eva;
    private Button btn_calcular;
    DecimalFormat df = new DecimalFormat("#.#");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_notas);

        et_epr1=findViewById(R.id.et_epr1);
        et_epe1=findViewById(R.id.et_epe1);
        et_epr2=findViewById(R.id.et_epr2);
        et_epe2=findViewById(R.id.et_epe2);
        et_eva=findViewById(R.id.et_eva);
        btn_calcular=findViewById(R.id.btn_calcular);
    }

    public void calcularPromedio(View v)
    {
        double promedio,
                epr1=Double.parseDouble(et_epr1.getText().toString()),
                epe1=Double.parseDouble(et_epe1.getText().toString()),
                epr2=Double.parseDouble(et_epr2.getText().toString()),
                epe2=Double.parseDouble(et_epe2.getText().toString()),
                eva=Double.parseDouble(et_eva.getText().toString());
        String mensaje="";
        promedio=(epr1*0.1)+(epe1*0.15)+(epr2*0.2)+(epe2*0.25)+(eva*0.3);

        if(epr1<4 || epr2<4 || epe1<4 || epe2<4 || eva<4)

            {
                mensaje="Debes dar examen por tener una(s) nota(s) menor a 4.0";
            }else
                {
            mensaje="No tienes notas rojas, verificar notas eva";
        }

        Toast.makeText(getApplicationContext(), "El promedio es: "+df.format(promedio)+". "+mensaje,Toast.LENGTH_SHORT).show();

    }
}
