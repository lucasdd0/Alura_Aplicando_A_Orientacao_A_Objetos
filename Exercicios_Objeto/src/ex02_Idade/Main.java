package ex02_Idade;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Ana";
        pessoa1.idade = 20;

        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");

        pessoa1.fazAniversario();

        System.out.println("A idade agora é: " +pessoa1.idade);


        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Luis";
        pessoa2.idade = 17;

        System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos");

        pessoa2.fazAniversario();

        System.out.println("A idade da pessoa agora é: " + pessoa2.idade);
    }
}
