package br.com.lucasdev.screenmatch.models;

public class Filme {            //a classe tem varios atributos => objetos
    private String nome;                //toda vez que eu der valor ao atributo eu instancio => instanciar
    private int anoDeLancamento;
    private boolean incluirNoPlano;
    private double avaliacao;
    private double somaDeAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private double nota;

    public void setNome(String nome) {          //O valor do nome vai ser armazenado no parametro "String nome". Só existe dentro desse método
        this.nome = nome;                   //set = modifica o valor => fazer modificações em outros métodos
    }

    public String getNome() {
        return nome;                        //get = pega o valor => fazer apenas a impressão em outros métodos
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluirNoPlano(boolean incluirNoPlano) {
        this.incluirNoPlano = incluirNoPlano;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setSomaDeAvaliacoes(double somaDeAvaliacoes) {
        this.somaDeAvaliacoes = somaDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

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
