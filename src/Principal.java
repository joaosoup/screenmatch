import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Por lugares incríveis");
        meuFilme.setAnoDeLancamento(2020);
        meuFilme.setDuracaoEmMinuto(108);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(6);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        /*meuFilme.somaDasAvaliacoes = 10;
        meuFilme.totalDeAvaliacoes = 1;
        System.out.println(meuFilme.pegaMedia());
        */
    }
}
