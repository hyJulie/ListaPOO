package Pessoa.test;

import Pessoa.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Roberto", 26, 'M');
        Pessoa p2 = new Pessoa("Carlos", 16, 'M');
        Pessoa p3 = new Pessoa("Iza", 20, 'F');

        p1.exibirDados();
        System.out.println();
        p2.exibirDados();
        System.out.println();
        p3.exibirDados();
    }
}
