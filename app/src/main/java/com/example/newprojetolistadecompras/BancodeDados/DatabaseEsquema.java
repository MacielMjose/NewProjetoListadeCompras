package com.example.newprojetolistadecompras.BancodeDados;

import android.database.sqlite.SQLiteDatabase;


public class DatabaseEsquema {      //superclasse que contem os metodos para criar Banco, atualizar, e destruir

    public class CriaBanco extends DatabaseEsquema
    {
        //@Override

        public void onCreate(SQLiteDatabase db)
        {

        }
    }
        //@Override

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
            System.out.println("Teste");
        }


}

