package com.example.parcial;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText texto1, texto2;
    private Button buttonSum, buttonres, buttonMulti, buttonDivi;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = findViewById(R.id.texto1);
        texto2 = findViewById(R.id.texto2);
        buttonSum = findViewById(R.id.buttonsum);
        buttonres = findViewById(R.id.buttonres);
        buttonMulti = findViewById(R.id.buttonmulti);
        buttonDivi = findViewById(R.id.buttondivi);
        textViewResult = findViewById(R.id.resultado);


        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calcularSuma();
            }
        });

        buttonres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularResta();
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularMultiplicacion();
            }
        });

        buttonDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularDivision();
            }
        });
    }

    private void calcularSuma() {
        double num1 = Double.parseDouble(texto1.getText().toString());
        double num2 = Double.parseDouble(texto2.getText().toString());
        double resultado = num1 + num2;
        textViewResult.setText(String.valueOf(resultado));
    }

    private void calcularResta() {
        double num1 = Double.parseDouble(texto1.getText().toString());
        double num2 = Double.parseDouble(texto2.getText().toString());
        double resultado = num1 - num2;
        textViewResult.setText(String.valueOf(resultado));
    }

    private void calcularMultiplicacion() {
        double num1 = Double.parseDouble(texto1.getText().toString());
        double num2 = Double.parseDouble(texto2.getText().toString());
        double resultado = num1 * num2;
        textViewResult.setText(String.valueOf(resultado));
    }

    private void calcularDivision() {
        double num1 = Double.parseDouble(texto1.getText().toString());
        double num2 = Double.parseDouble(texto2.getText().toString());
        if (num2 != 0) {
            double resultado = num1 / num2;
            textViewResult.setText(String.valueOf(resultado));
        } else {
            textViewResult.setText("No se puede dividir por cero");
        }
    }
}


    


