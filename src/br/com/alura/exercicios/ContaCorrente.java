package br.com.alura.exercicios;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {
    @Override
    public String getNome() {
        return super.getNome();
    }

    public static void main(String[] args) {
        int opcoes = 0;
        ContaBancaria minhaconta = new ContaBancaria();
        minhaconta.setSaldo(1500);
        minhaconta.setNome("Laiane");
        System.out.println("Essa conta é da Srª " + minhaconta.getNome());
        System.out.println("Seu saldo atual é de R$ " + minhaconta.getSaldo());

        Scanner ler = new Scanner(System.in);
        while (opcoes!=4) {
                    System.out.println("""
                    Seja bem -vindo 
                    O que deseja fazer?
                    1- Consultar saldo
                    2- Sacar
                    3- Depositar
                    4- Sair""");

            opcoes = Integer.parseInt(ler.nextLine());
            System.out.println("Voce deseja " + opcoes);
            if(opcoes==1){
                System.out.println("""
                        Você deseja vê seu Saldo!!!
                        Seu saldo é """ + minhaconta.getSaldo());
            }
            if(opcoes==2 ){
                opcoes = Integer.parseInt(ler.nextLine());
                System.out.println("""
                        Seu saque foi no valor de R$ 
                        """+ minhaconta.getSacar());
            }
        }
    }
}