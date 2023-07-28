package br.com.alura.screenmatch.modelos;

public class Filme {
        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliacoes;
        private int totalDeAvaliacoes;

        private int duracaoEmMinuto;

       public int getTotalDeAvaliacoes(){
            return totalDeAvaliacoes;

        }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinuto(int duracaoEmMinuto) {
        this.duracaoEmMinuto = duracaoEmMinuto;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome); 
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinuto);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }   

    public void avalia(double nota){
        somaDasAvaliacoes += nota; 
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}


    
