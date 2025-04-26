package br.com.alura.exercicios;

public class Molde {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setModelo("Fiat");
        carro1.setAno(2024);
        carro1.setPrecoMedio(40000);

        Carro carro2 = new Carro();
        carro2.setModelo("Fiat Strada");
        carro2.setAno(2024);
        carro2.setPrecoMedio(100000);

        System.out.println(carro1.getAno());
        System.out.println(carro1.getModelo());
        System.out.println("Valor R$ " + carro2.getPrecoMedio());



    }
}
