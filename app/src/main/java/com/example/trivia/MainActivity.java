package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.RadioButton;

import android.widget.TextView;

import android.widget.Toast;



import org.w3c.dom.Text;



public class MainActivity extends AppCompatActivity {

    //Se declaran los objetos para usarlos

    RadioButton rdOpc1, rdOpc2, rdOpc3;

    TextView txtNpregunta, txtPregunta;

    Button btnSiguiente, btnSalir;

    //Se declaran las variables para modificar la pregunta y las opciones, y para calcular la puntuacion

    //String NoPregunta, pregunta, opcion1, opcion2, opcion3;

    int nota = 0;
    int Npregunta = 1;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
/*


        //Se le asigna a cada objeto el id de lo que va a usar

        rdOpc1 = (RadioButton)findViewById(R.id.rdBtnOpc1);

        rdOpc2 = (RadioButton)findViewById(R.id.rdBtnOpc2);

        rdOpc3 = (RadioButton)findViewById(R.id.rdBtnOpc3);



        txtNpregunta = (TextView)findViewById(R.id.txtNpregunta);

        txtPregunta = (TextView)findViewById(R.id.txtPregunta);



        btnSiguiente = (Button)findViewById(R.id.btnSiguiente);

        btnSalir = (Button)findViewById(R.id.btnSalir);


        txtNpregunta.setText("Pregunta 1");

        txtPregunta.setText("La capital de Finlandia es?");

        rdOpc1.setText("Helsinky");

        rdOpc2.setText("Estocolmo");

        rdOpc3.setText("Oslo");

    }



    public void siguiente (View v){

        //if por si no se marca ninguna opcion

        if(rdOpc1.isChecked() == false && rdOpc2.isChecked() == false && rdOpc3.isChecked()==false){

            Toast.makeText(this, "Elija una opción", Toast.LENGTH_SHORT).show();

        }else


            if(Npregunta == 1){

            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota

            if(rdOpc1.isChecked()){

                nota = nota + 2;

            }

            //Se le suma 1 al contador de la pregunta

            Npregunta = Npregunta + 1;

            //Se setean los textos para la siguiente pregunta

            txtNpregunta.setText("Pregunta 2");

            txtPregunta.setText("El segundo planeta del sistema solar es?");

            rdOpc1.setText("Mercurio");

            rdOpc2.setText("Tierra");

            rdOpc3.setText("Venus");

            //Se limpian los Radio buttons para la siguiente pregunta

            rdOpc1.setChecked(false);

            rdOpc2.setChecked(false);

            rdOpc3.setChecked(false);

        }else if(Npregunta == 2) {

            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota

            if (rdOpc3.isChecked()) {

                nota = nota + 2;

            }

            //Se le suma 1 al contador de la pregunta

            Npregunta = Npregunta + 1;

            //Se setean los textos para la siguiente pregunta

            txtNpregunta.setText("Pregunta 3");

            txtPregunta.setText("El rio mas largo del mundo es?");

            rdOpc1.setText("Lena");

            rdOpc2.setText("Nilo");

            rdOpc3.setText("Amazonas");

            //Se limpian los Radio buttons para la siguiente pregunta

            rdOpc1.setChecked(false);

            rdOpc2.setChecked(false);

            rdOpc3.setChecked(false);

        }else if(Npregunta == 3) {

            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota

            if (rdOpc2.isChecked()) {

                nota = nota + 2;

            }

            //Se le suma 1 al contador de la pregunta

            Npregunta = Npregunta + 1;

            //Se setean los textos para la siguiente pregunta

            txtNpregunta.setText("Pregunta 4");

            txtPregunta.setText("El pais mas extenso del mundo es:");

            rdOpc1.setText("China");

            rdOpc2.setText("Estas Unidos");

            rdOpc3.setText("Rusia");

            //Se limpian los Radio buttons para la siguiente pregunta

            rdOpc1.setChecked(false);

            rdOpc2.setChecked(false);

            rdOpc3.setChecked(false);

        }else if(Npregunta == 4) {

            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota

            if (rdOpc3.isChecked()) {

                nota = nota + 2;

            }

            //Se le suma 1 al contador de la pregunta

            Npregunta = Npregunta + 1;

            //Se setean los textos para la siguiente pregunta

            txtNpregunta.setText("Pregunta 5");

            txtPregunta.setText("El simbolo NA de la tabla periodica corresponde a:");

            rdOpc1.setText("Plomo");

            rdOpc2.setText("Sodio");

            rdOpc3.setText("Potasio");

            //Se limpian los Radio buttons para la siguiente pregunta

            rdOpc1.setChecked(false);

            rdOpc2.setChecked(false);

            rdOpc3.setChecked(false);

        }else if(Npregunta == 5) {

            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota

            if (rdOpc2.isChecked()) {

                nota = nota + 2;

            }

            //Se setean los textos para el resultado de la nota

            txtNpregunta.setText("Nota obtenida: "+nota);

            //IF para verificar si se ha aprobado o reprobado

            if(nota >= 6){

                txtPregunta.setText("Estado: Aprobado");

            }else{

                txtPregunta.setText("Estado: Reprobado");

            }

            //Se ocultan las opciones que no se van a usar para ver la nota y resultado

            rdOpc1.setVisibility(View.GONE);

            rdOpc2.setVisibility(View.GONE);

            rdOpc3.setVisibility(View.GONE);

            btnSiguiente.setVisibility(View.GONE);

        }

    }



    public void Salir(View v){

        finish();

    }
*/
    }
}