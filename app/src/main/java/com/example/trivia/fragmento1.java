package com.example.trivia;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmento1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmento1 extends Fragment {



    public fragmento1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmento1.
     */
    // TODO: Rename and change types and number of parameters
    public static fragmento1 newInstance(String param1, String param2) {
        fragmento1 fragment = new fragmento1();
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
        return inflater.inflate(R.layout.fragment_fragmento1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view,savedInstanceState);

        Button bt1=view.findViewById(R.id.btnSiguiente1);
        RadioButton btn_respuesta= view.findViewById(R.id.rdBtn1Opc1);
        final NavController navController= Navigation.findNavController(view);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle argumento=new Bundle();
                argumento.putBoolean("respuesta1",btn_respuesta.isChecked());


                navController.navigate(R.id.fragmento2,argumento);

            }
        });
    }

}