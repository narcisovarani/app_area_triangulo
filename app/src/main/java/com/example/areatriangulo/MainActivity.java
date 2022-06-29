package com.example.areatriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.base = findViewById(R.id.edit_base);
        this.mViewHolder.altura = findViewById(R.id.edit_altura);
        this.mViewHolder.resultArea = findViewById(R.id.text_resultArea);
        this.mViewHolder.calcular = findViewById(R.id.button_calcular);
        this.mViewHolder.calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_calcular) ;
        {
            String value = this.mViewHolder.altura.getText().toString();
            String value2 = this.mViewHolder.base.getText().toString();


            if (value.isEmpty() || value2.isEmpty()) {
                Toast.makeText(this, "Base e Alturas são obrigatórios", Toast.LENGTH_LONG).show();
            }
            else {
                Double base = Double.valueOf(value);
                Double altura = Double.valueOf(value2);
                this.mViewHolder.resultArea.setText(String.format("%.2f", base*altura));

            }
        }
    }

    private static class ViewHolder {

    TextView resultArea;
    EditText altura;
    EditText base;
    Button calcular;

    }
}