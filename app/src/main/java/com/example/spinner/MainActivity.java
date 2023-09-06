package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //VIDEO #18 CURSO DE PROGRAMACION ANDROID DESDE CERO. -> LA GEEKIPEDIA DE ERNESTO.
    private Spinner spinner1;
    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.txtNum1);
        et2 = (EditText) findViewById(R.id.txtNum2);
        tv1 = (TextView) findViewById(R.id.tvtResultado);
        spinner1 = (Spinner) findViewById(R.id.spinner);

        //ARREGLO PARA QUE PERMITA LLENAR EL SPINNER.
        String [] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};

        //CREA LA COMUNICACION DEL ARREGLO PARA EL SPINNER.
        //ES TIPO STRING POR LO TANTO <String> Nombre =
        //LE DAMOS ESTILO AL SPINNER, CON EL ARCHIVO.xml QUE CREAMOS.  R(referencia carpeta res).layout(referencia carpeta layout).nombre_del_archivo.
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_pablo, opciones);

        //LE MANDAMOS LOS DATOS AL SPINNER
        spinner1.setAdapter(adapter);
    }

    //METODO DEL BOTON
    public void Calcular(View view){
        String Num1 = et1.getText().toString();
        String Num2 = et2.getText().toString();

        int N1 = Integer.parseInt(Num1);
        int N2 = Integer.parseInt(Num2);
        int resultado;
        tv1.setText("");

        String seleccion = spinner1.getSelectedItem().toString();
        if (seleccion.equals("Sumar")){
            resultado = N1 + N2;
            tv1.setText("La suma es: " + resultado);
        }
        if (seleccion.equals("Restar")){
            resultado = N1 - N2;
            tv1.setText("La resta es: " + resultado);
        }
        if (seleccion.equals("Multiplicar")){
            resultado = N1 * N2;
            tv1.setText("La multiplicación es: " + resultado);
        }
        if (seleccion.equals("Dividir")){
            resultado = N1 / N2;
            tv1.setText("La división es: " + resultado);
        }

    }
}