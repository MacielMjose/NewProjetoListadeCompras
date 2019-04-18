package com.example.newprojetolistadecompras.JavaClasses;

public class Produto {


    private int id, Qtde;
    private String nomeProduto;
    private float preco; //terá que ser convertido para Real para funcionar no SQLITE

    @Override

    public String toString() {
        return this.nomeProduto;
    }

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

        return nomeProduto;
    }

    public void setNome(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


}
