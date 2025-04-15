package com.example.smarttask;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    EditText etTitulo, etDescricao, etData, etPrioridade;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etTitulo = findViewById(R.id.etTitulo);
        etDescricao = findViewById(R.id.etDescricao);
        etData = findViewById(R.id.etData);
        etPrioridade = findViewById(R.id.etPrioridade);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            String titulo = etTitulo.getText().toString();
            String descricao = etDescricao.getText().toString();
            String data = etData.getText().toString();
            int prioridade = Integer.parseInt(etPrioridade.getText().toString());

            Tarefa novaTarefa = new Tarefa(titulo, descricao, data, prioridade);

            // Salvando na lista
            TarefaRepository.adicionarTarefa(novaTarefa);

            Toast.makeText(this, "Tarefa cadastrada!", Toast.LENGTH_SHORT).show();
            finish();
        });


    }
}