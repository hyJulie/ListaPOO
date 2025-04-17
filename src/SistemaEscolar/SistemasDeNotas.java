package SistemaEscolar;

import java.util.Scanner;

public class SistemasDeNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do Professor: ");
        String nomeProf = scan.nextLine();
        Professor professor = new Professor(nomeProf);

        Turma turma = new Turma("Turma Batman");

        System.out.println("Quantas disciplinas deseja adicionar? ");
        int qtdDisciplinas = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < qtdDisciplinas; i++) {
            System.out.println("Nome da disciplina " + (i + 1) + " : ");
            String nomeD = scan.nextLine();
            turma.adicionarDisciplinas(new Disciplina(nomeD, professor));
        }

        System.out.println("Quantos alunos deseja cadastrar? ");
        int qtdAlunos = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Nome do Aluno " + (i + 1) + " : ");
            String nomeA = scan.nextLine();
            Aluno aluno = new Aluno(nomeA);

            System.out.print("Quantas notas deseja inserir para " + nomeA +"?");
            int qtdNotas =  Integer.parseInt(scan.nextLine());
            for (int j =0; j < qtdNotas;j++){
                System.out.println("Notas: "+(j + 1)+" :");
                double nota = scan.nextDouble();
                aluno.adicionarNota(nota);
            }

            turma.adicionarAluno(aluno);
        }

        turma.exibirInfo();
        scan.close();
    }
}
/*
Integer.parseInt(String s) - pega uma String que representa um número inteiro e transforma ela em um int (tipo primitivo)
usar nextInt pode dar problema com o buffer, pq se utilizar o nextLine depois ele pode acabar pulando linha sem ler direito
 */