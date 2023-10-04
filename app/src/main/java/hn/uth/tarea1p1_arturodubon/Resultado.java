package hn.uth.tarea1p1_arturodubon;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        // Obtenemos el valor del resultado
        double resultado = getIntent().getDoubleExtra("resultado", 0);

        // Asignamos el valor al TextView
        TextView Resultado = findViewById(R.id.txtMostrar);
        Resultado.setText(String.valueOf(resultado));
    }
}
