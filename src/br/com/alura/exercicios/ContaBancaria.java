package br.com.alura.exercicios;

public class ContaBancaria {
    private double depositar;
    private double sacar;
    private String nome;
    private double saldo;

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public Object setSacar(double sacar) {
        this.sacar = sacar;
        return saldo - sacar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double consultarSaldo(){
        saldo = depositar - sacar;
        return saldo;
    }

    protected double setSacar() {
        saldo -= sacar;
        return saldo;
    }
}

