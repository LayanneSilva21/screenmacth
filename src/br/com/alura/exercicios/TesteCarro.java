package br.com.alura.exercicios;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setModelo("Fiat");
        carro1.definirPrecos(30000, 32000, 35000);
        carro1.exibirInfo();


        Carro carro2 = new Carro();
        carro2.setModelo("Fiat Strada");
        carro2.definirPrecos(60000, 50000, 40000);
        carro2.exibirInfo();

    }
}
