package SistemaEscolar;

import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionarDisciplinas(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void exibirInfo(){
        System.out.println("Nome Turma: "+nomeTurma);
        System.out.println("Disciplinas: ");
        for (Disciplina d : disciplinas){
            System.out.println(" - "+d.getNomeDisciplina()+" (Professor: "+d.getProfessor().getNome()+")");
        }
        System.out.println("Alunos:");
        for (Aluno a : alunos){
            System.out.println(" - "+a.getNome()+" | Média: "+a.calcularMedia());
            a.mostrarNotas();
        }
    }
}
