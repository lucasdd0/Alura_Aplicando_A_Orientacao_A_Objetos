package ex01_Filme;

public class Filme {            //a classe tem varios atributos => objetos
    String nome;                //toda vez que eu der valor ao atributo eu instancio => instanciar
    int anoDeLancamento;
    boolean incluirNoPlano;
    double avaliacao;
    double somaDeAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    double nota;

    void exibeFichaTecnica(){           //métodos dentro da classe => naneira de fazer algo
        System.out.println(nome + "\n" + anoDeLancamento + "\n" + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDeAvaliacoes/totalDeAvaliacoes;
    }

}
