package com.example.newprojetolistadecompras;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private FloatingActionButton addLista;
    private ListView minhasListas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addLista = findViewById(R.id.addLista);

        minhasListas = (ListView) findViewById(R.id.minhasListas);

        addLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            startActivity(new Intent(MainActivity.this, AddprodutoActivity.class));


            }
        });


    }
}
