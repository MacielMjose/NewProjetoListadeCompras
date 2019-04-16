package com.example.newprojetolistadecompras;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddprodutoActivity extends Activity {

    private TextView addProduto;
    private TextView addPreco;
    private TextView addQtd;

    private Button btnSalvarProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addproduto);


        addProduto = (TextView) findViewById(R.id.addProduto);
        addPreco = (TextView) findViewById(R.id.addPreco);
        addQtd = (TextView) findViewById(R.id.addQtd);

        btnSalvarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //salvarProduto();
            }
        });

        //private void salvarProduto(){

            //Produto produto = new Produto();


       // }





    }
}
