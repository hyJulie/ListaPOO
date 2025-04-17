package Escola.test;

import Escola.Aluno;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media;

        System.out.println("Digite o Nome do Aluno: ");
        String nome = scan.nextLine();

        System.out.println("Digite a primeira nota do Aluno: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota do Aluno: ");
        double nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        Aluno aluno1 = new Aluno(nome, nota1, nota2);
        aluno1.statusAluno();
        System.out.println("A media foi de "+media);
    }
}
