package br.com.alura.exercicios;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
        super.emitirSom();
    }
}
