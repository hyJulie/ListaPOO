package LojaVirtual;

public class ProdutoVirtual {
     private String nome;
     private double preco;

    public ProdutoVirtual(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarInfo(){
        System.out.println("Nome: "+nome+" Preço: R$"+preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
