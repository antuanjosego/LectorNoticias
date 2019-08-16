package com.example.lectornoticias;

import android.app.ListActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    ArrayList<Item> data = null;
    ItemAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null)
        {

            data = new ArrayList<Item>();
            data.add(new Item("CRISIS GRECIA - Grecia y los acreedores logran un acuerdo para el próximo desembolso", "link", "Tue, 17 Nov 2015 08:13:00", "categoria", "guid"));
            data.add(new Item("FRACIA TERRORISMO REFUGIADOS - Vientiséis estados de EEUU no acogerán refugiados sirios por el ataque de Paris", "link", "Tue, 17 Nov 2015 08:15:00", "categoria", "guid"));
            data.add(new Item("FRANCIA TERRORISMO - Francia bombardea posiciones del EI en Al Raga por segunda noche consecutiva", "link", "Tue, 17 Nov 2015 10:24:00", "categoria", "guid"));
            data.add(new Item("TURISMO EMPLEO - La afiliación a la Seguridad Social en el turismo sube un 6,6% en Octubre", "link", "Tue, 17 Nov 2015 10:20:00", "categoria", "guid"));
            adapter = new ItemAdapter(MainActivity.this, data);
        }
        else
        {
            data = savedInstanceState.getParcelableArrayList("savedData");
            adapter = new ItemAdapter(MainActivity.this, data);
        }

        setListAdapter(adapter);

    }
}
