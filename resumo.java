package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resumo extends AppCompatActivity {
TextView tvres;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);

    i=getIntent();
    tvres=findViewById(R.id.tv_res);

    tvres.setText(i.getExtras().getString("pedido"));


    }
}