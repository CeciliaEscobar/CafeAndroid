package com.cecilia.cafececilia;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoColeccion extends Fragment {

    View view;
    Button botonColeccUno;
    Button botonColeccDos;
    Button botonColeccTres;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmento_coleccion, container, false);

        botonColeccUno = (Button) view.findViewById(R.id.btncoleccuno);
        botonColeccUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Suscribiendo a un Gran Espresso...", Toast.LENGTH_SHORT).show();
            }
        });


        botonColeccDos = (Button) view.findViewById(R.id.btncoleccdos);
        botonColeccDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Suscribiendo a un Planalto...", Toast.LENGTH_SHORT).show();
            }
        });

//        Boton Tres
        botonColeccTres = (Button) view.findViewById(R.id.btncolecctres);
        botonColeccTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Suscribiendo a un Danche...", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}