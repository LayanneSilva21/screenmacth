package br.com.alura.screenmacth.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel Classificavel){
        if(Classificavel.getClassificacao()>=4){
            System.out.println("Está entre os preferidos do momento!");
        }
        else if(Classificavel.getClassificacao()>=2){
            System.out.println("Muito bem avaliado no momento");
        }
        else{
            System.out.println("Coloque na sua lista");
        }
    }
}
