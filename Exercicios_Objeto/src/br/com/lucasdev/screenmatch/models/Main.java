package br.com.lucasdev.screenmatch.models.Filme;

import br.com.lucasdev.screenmatch.models.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Motoqueiro Fantasma");
        meuFilme.setAnoDeLancamento(1980);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(6);
        meuFilme.avalia(5);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.somaDeAvaliacoes);

        System.out.println(meuFilme.pegaMedia());
    }

}