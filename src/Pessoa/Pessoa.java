package Pessoa;

public class Pessoa {
    private String name;
    private int idade;
    private char sexo;

    public Pessoa(String name, int idade, char sexo) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void exibirDados(){
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Nome: " + name +
                "\nIdade: " + idade +
                "\nSexo: " + sexo +
                "\nMaior de idade: " + (isMaiorDeIdade() ? "Sim" : "Não");
    }

    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }


}
