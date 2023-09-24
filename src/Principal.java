import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Por lugares incríveis");
        meuFilme.setAnoDeLancamento(2020);
        meuFilme.setDuracaoEmMinutos(108);
        meuFilme.setIncluidoNoPlano(true);
        
        

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(6);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        
        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(0);
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());
        
    }
}
