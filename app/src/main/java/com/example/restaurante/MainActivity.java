package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb_cafe, cb_agua, cb_gelado, cb_mleite, cb_sumo;
    Button bt_efetuarPedido;
    Double cafe = .50, gelado = 0.50, agua = 0.50, mleite = 0.50, sumo = 0.50;
    EditText et_cafe, et_agua, et_gelado, et_mleite, et_sumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb_agua = findViewById(R.id.cd_agua);
        cb_cafe = findViewById(R.id.cd_cafe);
        cb_gelado = findViewById(R.id.cd_gelado);
        cb_mleite = findViewById(R.id.cd_meiaLeite);
        cb_sumo = findViewById(R.id.cd_sumo);

        et_agua = findViewById(R.id.et_quantAgua);
        et_cafe = findViewById(R.id.et_quantCafe);
        et_gelado = findViewById(R.id.et_quantGelado);
        et_mleite = findViewById(R.id.et_quantLeite);
        et_sumo = findViewById(R.id.et_quantSumo);

        bt_efetuarPedido = findViewById(R.id.bt_efetuarPedido);
        bt_efetuarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pedido = "";
                double valor = 0;
                if (cb_agua.isChecked()) {

                    int quant = Integer.parseInt(et_agua.getText().toString());
                    pedido += quant + "Água\n";
                    valor += quant * agua;

                }
                if (cb_cafe.isChecked()) {

                    int quant = Integer.parseInt(et_cafe.getText().toString());
                    pedido += quant + "café\n";
                    valor += quant * cafe;
                }
                if (cb_gelado.isChecked()) {

                    int quant = Integer.parseInt(et_gelado.getText().toString());
                    pedido += quant + "gelado\n";
                    valor += quant * gelado;
                }
                if (cb_mleite.isChecked()) {

                    int quant = Integer.parseInt(et_mleite.getText().toString());
                    pedido += quant + "meia de leite\n";
                    valor += quant * mleite;
                }
                if (cb_sumo.isChecked()) {

                    int quant = Integer.parseInt(et_sumo.getText().toString());
                    pedido += quant + "sumo\n";
                    valor += quant * sumo;
                }
                if (pedido.equals("")) {
                    Toast.makeText(MainActivity.this, "Pedido inválido", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(MainActivity.this, SplashScrennActivity.class);
                    i.putExtra("pedido", pedido + "Valor a pagar: " + String.valueOf(valor));
                    startActivity(i);
                }

            }
        });

    }
}