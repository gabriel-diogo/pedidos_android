package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class screm extends AppCompatActivity {
String pedido="";
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screm);

        i=getIntent();
        pedido=i.getExtras().getString("pedido");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                i=new Intent(screm.this,resumo.class);
                i.putExtra("pedido",pedido);
                startActivity(i);
            }
        },4000);

    }
}