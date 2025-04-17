package Empresa;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calculaBonus();

    public void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.printf("Salário: R$ %.2f\n",salario);
        System.out.printf("Bônus: R$ %.2f\n",calculaBonus());
    }
}
