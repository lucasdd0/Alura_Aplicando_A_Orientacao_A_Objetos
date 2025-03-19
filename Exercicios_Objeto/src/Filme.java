public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluirNoPlano;
    double avaliacao;
    double somaDeAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    double nota;

    void exibeFichaTecnica(){
        System.out.print(nome + "\n" + anoDeLancamento + "\n" + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }

}
