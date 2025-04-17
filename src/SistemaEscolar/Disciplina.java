package SistemaEscolar;

import java.util.ArrayList;

public class Disciplina {
    private String nomeDisciplina;
    private Professor professor;

    public Disciplina(String nomeDisciplina, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }
}
