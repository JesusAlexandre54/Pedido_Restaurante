package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import kotlinx.coroutines.Delay;

public class SplashScrennActivity extends AppCompatActivity {
    Intent i;
    String pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screnn);
        i = getIntent();
        pedido = i.getExtras().getString("pedido");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                i = new Intent(SplashScrennActivity.this,ResumoPedidoActivity.class);
                i.putExtra("pedido",pedido);
                startActivity(i);

            }
        }, 4000);
    }
}