//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Motoqueiro Fantasma";
        meuFilme.anoDeLancamento = 1980;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        meuFilme.avalia(5);

        System.out.println();
        System.out.println(meuFilme.somaDeAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);

        System.out.println(meuFilme.pegaMedia());
    }

}