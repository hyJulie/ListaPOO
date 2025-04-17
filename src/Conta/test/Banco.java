package Conta.test;

import Conta.ContaBancaria;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(12345-6);

        minhaConta.depositar(500);
        minhaConta.saldoAtual();

        minhaConta.sacar(200);
        minhaConta.saldoAtual();
    }
}
