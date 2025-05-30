package br.com.lucasdev.screenmatch.models.banco;

import java.util.Random;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public void menuPrincipal() {
        int opcao = 0;
        String menu = "1. Cadastrar\n" +
                        "2. Depositar\n" +
                        "3. Sacar\n" +
                        "4. Finalizar";

        do {
            opcao = parseInt(showInputDialog(menu));
            if (opcao < 1 || opcao > 4) {
                showMessageDialog(null, "Opção inválida!");
            } else {
                switch (opcao) {
                    case 1:
                        menuCadastro();
                        break;
                    case 2:
                        menuDepositar();
                        break;
                    case 3:
                        menuSacar();
                        break;
                    case 4:
                        break;
                }
            }
        } while (opcao != 4);
    }

    private int gerarNumero(){
        Random rd = new Random();
        return rd.nextInt(1000, 10000);
    }

    private void menuCadastro() {
        saldo = 0;
        numeroConta = gerarNumero();
        showMessageDialog(null,"O número da sua conta é: " + numeroConta);
        titular = showInputDialog("Digite o seu nome: ");
        saldo = parseDouble(showInputDialog("Digite seu saldo: "));
        showMessageDialog(null, "Conta cadastrada com sucesso!");
    }

    private void menuDepositar() {
        double valor = parseDouble(showInputDialog("Digite quanto deseja depositar: "));
        saldo += valor;
        showMessageDialog(null, "Seu saldo atual é R$" + saldo);
    }

    private void menuSacar() {
        double valor = parseDouble(showInputDialog("Digite quanto deseja sacar: "));
        saldo -= valor;
        showMessageDialog(null, "Seu saldo atual é R$" + saldo);
    }
}
