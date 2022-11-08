package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResumoPedidoActivity extends AppCompatActivity {

    TextView tv_resumo;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pedido);

        i = getIntent();
        tv_resumo =  findViewById(R.id.tv_resumoPedido);
        tv_resumo.setText(i.getExtras().getString("pedido"));
    }
}