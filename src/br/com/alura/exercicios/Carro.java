package br.com.alura.exercicios;

public class Carro {
    private String modelo;
    private int precoMedio;
    private int ano;


    public void setPrecoMedio(int precoMedio) {
        this.precoMedio = precoMedio;
    }

    public int getPrecoMedio() {
        return precoMedio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}

