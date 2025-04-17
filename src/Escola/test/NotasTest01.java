package Escola.test;

//FORMA MAIS SIMPLES

import java.util.Scanner;

public class NotasTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scan.nextLine();

        System.out.println("Digite a primeira nota do Aluno: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota do Aluno: ");
        double nota2 = scan.nextDouble();

        double media;

        media = (nota1 + nota2) / 2;

       if (media >= 7){
           System.out.println("A média das notas foi "+media+" e o aluno está aprovado!");
       }else {
           System.out.println("A média das notas foi "+media+"e o aluno está reprovado.");
       }

       scan.close();
    }
}
