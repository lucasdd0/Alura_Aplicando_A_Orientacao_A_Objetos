package ex03_Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    String nome;
    int idade;
    int rm;
    ArrayList<Double> notas = new ArrayList<>();
    double media;
    double somaNotas;


    void coletaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = sc.next();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite seu rm: ");
        rm = sc.nextInt();
    }

    void mostraIdentidade(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nRM: " + rm);
    }

    void coletaNotas(){
        Scanner sc = new Scanner(System.in);

        double nota;

        while(true){
            System.out.println("Digite a nota (ou -1 para finalizar): ");
            nota = sc.nextDouble();

            if(nota == -1){
                break;
            }

            notas.add(nota);
        }

    }

    void mostrarNotas(){
        System.out.println("Notas do aluno " + nome);
        for(Double nota :notas){
            System.out.println(nota);
        }
    }

    double media(){
        for(Double nota : notas){
            somaNotas += nota;
        }

        return media = somaNotas / notas.size();
    }

    void mostrarMedia(){
        System.out.println("Sua média é: " + media);
    }

}
