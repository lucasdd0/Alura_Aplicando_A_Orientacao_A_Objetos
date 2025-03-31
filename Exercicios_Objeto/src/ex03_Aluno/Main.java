package ex03_Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.coletaDados();

        aluno1.mostraIdentidade();

        aluno1.coletaNotas();

        //aluno1.notas.add(9.0);          //não está encapsulado => isso é um meio de burlar o programa

        aluno1.mostrarNotas();

        aluno1.media();

        aluno1.mostrarMedia();

    }
}
