package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox suco,leite,cafe,gel;
    Button b;

    double vcafe=0.5,vsuco=4.5,vgel=1.4,vleite=5.4;
    EditText et_cafe,et_suco,et_gel,et_leite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    gel=findViewById(R.id.cb_gel);
    suco=findViewById(R.id.cb_suco);
    cafe=findViewById(R.id.cb_cafe);
    leite=findViewById(R.id.cb_leite);
    b=findViewById(R.id.bt_p);

    et_cafe=findViewById(R.id.et_qcafe);
    et_gel=findViewById(R.id.et_qgel);
    et_leite=findViewById(R.id.et_qleite);
    et_suco=findViewById(R.id.et_qsuco);

    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String pedido="";
            double val=0;


            if(cafe.isChecked()){

                int quant=Integer.parseInt(et_cafe.getText().toString());
                val+=quant*vcafe;
                pedido+=quant+ " cafe\n";

            }
            if(suco.isChecked()){
                int quant=Integer.parseInt(et_suco.getText().toString());
                val+=quant*vsuco;pedido+=quant+" suco\n";
            }
            if(gel.isChecked()){
                int quant=Integer.parseInt(et_gel.getText().toString());
                val+=quant*vgel;pedido+=quant+" gel\n";}
            if(leite.isChecked()){
                int quant=Integer.parseInt(et_leite.getText().toString());
                val+=quant*vleite;pedido+=quant+" leite\n";
            }

            if(pedido.equals("")){
                Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_SHORT).show();
            }else {
                Intent i =new Intent(MainActivity.this,screm.class);
                i.putExtra("pedido",pedido+"valor do pedido "+val+" R$");
                startActivity(i);
            }
        }
    });

    }
}