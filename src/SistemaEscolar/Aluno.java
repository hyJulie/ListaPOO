package SistemaEscolar;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota){
        notas.add(nota);
    }

    public double calcularMedia(){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return !notas.isEmpty() ? soma / notas.size() : 0;
    }

    public void mostrarNotas(){
        System.out.println("Notas de "+nome+" : "+notas);
    }

    public String getNome() {
        return nome;
    }
}
