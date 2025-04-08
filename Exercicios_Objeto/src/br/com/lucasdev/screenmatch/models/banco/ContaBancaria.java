package br.com.lucasdev.screenmatch.models.banco;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;
    private List<ContaBancaria> contas = new ArrayList<>();

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setContas(List<ContaBancaria> contas) {
        this.contas = contas;
    }

    public void menuPrincipal() {
        int opcao = 0;
        String menu = "1. Cadastrar\n" +
                "2. Depositar\n" +
                "3. Sacar\n" +
                "4. Menu Status\n" +
                "5. Finalizar";

        do {
            opcao = parseInt(showInputDialog(menu));
            if (opcao < 1 || opcao > 5) {
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
                        menuContas();
                        break;
                    case 5:
                        showMessageDialog(null, "Programa finalizado!");
                        break;
                }
            }
        } while (opcao != 5);
    }

    private void menuCadastro() {
        saldo = 0;
        titular = showInputDialog("Digite o nome do titular: ");
        numeroConta = parseInt(showInputDialog("Digite o número da conta: "));
        contas.add(new ContaBancaria(titular, numeroConta));
        showMessageDialog(null, "Conta cadastrada com sucesso!");
    }

    private void menuDepositar() {
        double valor = parseDouble(showInputDialog("Quanto deseja depositar: "));
        saldo += valor;
        showMessageDialog(null, "Depósito realizado com sucesso! Novo saldo: R$" + String.format("%.2f", saldo));
    }

    private void menuSacar() {
        double valor = parseInt(showInputDialog("Quanto deseja sacar: "));
        saldo -= valor;
        showMessageDialog(null, "Saque realizado com sucesso! Novo saldo: R$" + String.format("%.2f", saldo));
    }

    public abstract void menuContas();
}
