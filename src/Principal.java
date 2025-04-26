import br.com.alura.screenmacth.calculos.CalculadoraDeTempo;
import br.com.alura.screenmacth.modelos.Filme;
import br.com.alura.screenmacth.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Frozen");
        meuFilme.setAnoDeLancamento(2019);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);


        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obtemMedia());

        Serie suits = new Serie();
        suits.setNome("Suits");
        suits.setAnoDeLancamento(2008);
        suits.exibeFichaTecnica();
        suits.setTemporada(9);
        suits.setEpisodiosPorTemporada(16);
        suits.setMinutosPorEpisodio(42);
        System.out.println("Maratonar a serie leva " + suits.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Um amor para recordar");
        outroFilme.setAnoDeLancamento(2008);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(suits);
        System.out.println(calculadora.getTempoTotal());


    }
}
