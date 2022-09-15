package com.example.trivia;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link resultado#newInstance} factory method to
 * create an instance of this fragment.
 */
public class resultado extends Fragment {



    public resultado() {
        // Required empty public constructor
    }
    public static resultado newInstance(String param1, String param2) {
        resultado fragment = new resultado();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resultado, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int nota=0;
        TextView TextNota=(TextView) view.findViewById(R.id.txtNota);
        TextView TextEstado=(TextView) view.findViewById(R.id.txtEstado);

        Boolean respuesta1,respuesta2,respuesta3,respuesta4,respuesta5;

        respuesta1=getArguments().getBoolean("respuesta1");
        respuesta2=getArguments().getBoolean("respuesta2");
        respuesta3=getArguments().getBoolean("respuesta3");
        respuesta4=getArguments().getBoolean("respuesta4");
        respuesta5=getArguments().getBoolean("respuesta5");

        if(respuesta1)
            nota+=2;
        if(respuesta2)
            nota+=2;
        if(respuesta3)
            nota+=2;
        if(respuesta4)
            nota+=2;
        if(respuesta5)
            nota+=2;

        if(nota<=6)
            TextEstado.setText("Reprobado");
        else
            TextEstado.setText("Aprobado");

        TextNota.setText("La nota es "+nota);
    }

}