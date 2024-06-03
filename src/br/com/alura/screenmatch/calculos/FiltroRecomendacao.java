package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao()>=4){
            System.out.println("Preferidos.");
        } else if (classificavel.getClassificacao()>=2) {
            System.out.println("Na media");

        } else {
            System.out.println("Assistir depois");
            
        }
    }

}
