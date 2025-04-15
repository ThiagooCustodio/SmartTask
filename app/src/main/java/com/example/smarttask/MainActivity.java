package com.example.smarttask;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCadastrar, btnListar, btnCompartilhar, btnAnalise, btnSobre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnListar = findViewById(R.id.btnListar);
        btnCompartilhar = findViewById(R.id.btnCompartilhar);
        btnAnalise = findViewById(R.id.btnAnalise);
        btnSobre = findViewById(R.id.btnSobre);

        btnCadastrar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
            startActivity(intent);
        });
        btnListar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListaActivity.class);
            startActivity(intent);
        });
        btnCompartilhar.setOnClickListener(v -> {

        });

        btnAnalise.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AnaliseActivity.class);
            startActivity(intent);
        });
        btnSobre.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SobreActivity.class);
            startActivity(intent);
        });


    }
}