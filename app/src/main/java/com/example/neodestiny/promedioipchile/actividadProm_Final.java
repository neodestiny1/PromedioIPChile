package com.example.neodestiny.promedioipchile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;
/*Copyright (C) 2018  David Andres Diaz Cisternas

        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU General Public License as published by
        the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU General Public License for more details.

        You should have received a copy of the GNU General Public License
        along with this program.  If not, see <http://www.gnu.org/licenses/>*/
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
