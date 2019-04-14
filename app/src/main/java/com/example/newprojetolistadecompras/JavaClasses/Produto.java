package com.example.newprojetolistadecompras.JavaClasses;

public class Produto {


    private int id, Qtde;
    private String nome;
    private float preco; //terá que ser convertido para Real para funcionar no SQLITE


    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtde() {
        return Qtde;
    }

    public void setQtde(int qtde) {
        Qtde = qtde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }



}
