public class Filme {
        String nome;
        int anoDeLancamento;
        Boolean incluidoNoPlano;
        double somaDasAvaliacoes;
        int totalDeAvaliacoes;
        int duracaoEmMinuto;
    

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome); 
        System.out.println("Ano de lançamento: " + anoDeLancamento);  
    }   

    void avalia(double nota){
        somaDasAvaliacoes += nota; 
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}


    
