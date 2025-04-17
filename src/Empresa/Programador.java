package Empresa;

public class Programador extends Funcionario{

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return salario * 0.10;
    }
}
