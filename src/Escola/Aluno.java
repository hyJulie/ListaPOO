package Escola;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    public boolean isAprovado(){
        return nota1 >= 7 && nota2 >= 7;
    }

    public void statusAluno(){
        System.out.println("Nome do Aluno: "+nome);
        System.out.println("Primeira nota: "+nota1);
        System.out.println("Segunda nota: "+nota2);
        System.out.println("Media Final: "+(isAprovado() ? "Aprovado" : "Reprovado"));
    }
}
