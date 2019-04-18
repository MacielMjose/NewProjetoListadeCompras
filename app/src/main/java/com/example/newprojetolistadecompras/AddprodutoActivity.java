package com.example.newprojetolistadecompras;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.newprojetolistadecompras.JavaClasses.Produto;

import static com.example.newprojetolistadecompras.R.id.btnSalvarProduto;


public class AddprodutoActivity extends AppCompatActivity {

    private EditText etProduto;
    private EditText etPreco;
    private EditText etQtd;

    private Button btnSalvarProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_addproduto);


        etProduto = (EditText) findViewById(R.id.addProduto);
        etPreco = (EditText) findViewById(R.id.addPreco);
        etQtd = (EditText) findViewById(R.id.addQtd);
        btnSalvarProduto = (Button)findViewById(R.id.btnSalvarProduto);

        btnSalvarProduto.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                salvar();
            }


        });


    }
        private void salvar(){

            Produto produto = new Produto();
            produto.setQtde(Integer.parseInt(etQtd.getText().toString()));
            produto.setNome(etProduto.getText().toString());
            produto.setPreco(Float.parseFloat(etPreco.getText().toString()));
            ProdutoDAO.inserir(produto , this);

            this.finish();

            Toast.makeText( AddprodutoActivity.this,"Produto Adicionado à Lista!",Toast.LENGTH_SHORT).show();
        }
    }



