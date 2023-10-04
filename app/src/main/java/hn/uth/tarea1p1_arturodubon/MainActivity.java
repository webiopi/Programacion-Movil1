package hn.uth.tarea1p1_arturodubon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText Numero1, Numero2;

    Button btnSumar, btnRestar, btnMulti, btnDivi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numero1= findViewById(R.id.txtNumero1);
        Numero2= findViewById(R.id.txtNumero2);

        btnSumar= (Button) findViewById(R.id.btnSumar);
        btnRestar= (Button) findViewById(R.id.btnRestar);
        btnMulti= (Button) findViewById(R.id.btnMulti);
        btnDivi= (Button) findViewById(R.id.btnDivi);

        btnSumar.setOnClickListener(new View.OnClickListener() { //setOnClickListener es el metodo de escucha del boton
            @Override
            public void onClick(View v) {//Realiza una acción cuando el usuario hace clic en el botón
                int Num1= Integer.parseInt(String.valueOf(Numero1.getText()));
                int Num2= Integer.parseInt(String.valueOf(Numero2.getText()));

                int Sumar= Num1 + Num2;//Realizamos la operacion

                //Iniciamos el segundo Main Activity
                Intent intent= new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("resultado", Sumar);
                startActivity(intent);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Num1= Integer.parseInt(String.valueOf(Numero1.getText()));
                int Num2= Integer.parseInt(String.valueOf(Numero2.getText()));

                int Restar= Num1 - Num2;//Realizamos la operacion

                //Iniciamos el segundo Main Activity
                Intent intent= new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("resultado", Restar);
                startActivity(intent);

            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Num1= Integer.parseInt(String.valueOf(Numero1.getText()));
                int Num2= Integer.parseInt(String.valueOf(Numero2.getText()));

                int Multiplicar= Num1 * Num2;//Realizamos la operacion

                //Iniciamos el segundo Main Activity
                Intent intent= new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("resultado", Multiplicar);
                startActivity(intent);

            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Num1= Double.parseDouble(String.valueOf(Numero1.getText()));
                double Num2= Double.parseDouble(String.valueOf(Numero2.getText()));

                if (Num2 == 0) {
                    // Mostramos un mensaje de error al usuario
                    Toast.makeText(MainActivity.this, "En una Division Numero 2 no puede ser 0", Toast.LENGTH_LONG).show();
                    return;
                }

                double Dividir= Num1 / Num2;//Realizamos la operacion

                //Iniciamos el segundo Main Activity
                Intent intent= new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("resultado", Dividir);
                startActivity(intent);

            }
        });

    }
}