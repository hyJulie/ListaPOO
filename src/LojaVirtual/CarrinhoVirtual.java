package LojaVirtual;

import java.util.ArrayList;

public class CarrinhoVirtual {
    private ArrayList<ProdutoVirtual> produtos = new ArrayList<>();

    public void adicionarProdutos(ProdutoVirtual produto){
        produtos.add(produto);
        System.out.println(produto.getNome()+" adicionado ao carrinho");
    }

    public void mostrarCarrinho(){
        System.out.println("Carrinho de compras");
        double total = 0;
        for (ProdutoVirtual produto : produtos){
            produto.mostrarInfo();
            total += produto.getPreco();
        }
        System.out.println("Total: R$ " + total);
    }

    public void aplicarDesconto(double porcentagem){
        double total = 0;
        for (ProdutoVirtual produto : produtos){
            total += produto.getPreco();
        }

        double desconto = total * porcentagem / 100;
        double totalComDesconto = total - desconto;

        System.out.printf("\n💸 Desconto de %.1f%% aplicado!\n", porcentagem);
        System.out.printf("Total sem desconto: R$ %.2f\n", total);
        System.out.printf("Valor do desconto: R$ %.2f\n", desconto);
        System.out.printf("Total com desconto: R$ %.2f\n", totalComDesconto);
    }
}
