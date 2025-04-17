package SistemaPedidos;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProdutos(Produto produto){
        produtos.add(produto);
    }

    public double calcularTotal(){
        double total = 0;
        for (Produto p : produtos){
            total += p.getPreco();

        }
        return total;
    }

    public void exibirProdutos(){
        System.out.println("----Produtos no Carrinho----");
        for (Produto p : produtos){
            System.out.println(p.getNome()+" - R$ "+p.getPreco());
        }
    }
}
