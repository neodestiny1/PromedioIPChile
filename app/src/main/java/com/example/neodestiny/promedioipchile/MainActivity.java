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
package com.example.neodestiny.promedioipchile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_notas, btn_examen, btn_eva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_notas = findViewById(R.id.btn_notas);
        btn_examen = findViewById(R.id.btn_examen);
        btn_eva = findViewById(R.id.btn_eva);
    }

    public void abrirNotas(View v)
    {
     startActivity(new Intent(MainActivity.this, actividadNotas.class));
    }

    public void abrirExamen (View v)
    {
      startActivity(new Intent(MainActivity.this,actividadExamen.class));
    }

    public void abrirEva (View v)
    {
      startActivity(new Intent(MainActivity.this, actividadEva.class));
    }

    public void abrirInformación (View v)
    {
        startActivity(new Intent(MainActivity.this, actividadInformacion.class));
    }
    public void abrirPromedioFinal(View v)
    {
        startActivity(new Intent(MainActivity.this, actividadProm_Final.class));
    }
}
