package Loja.test;

import Loja.Produto;

public class Vendas {
    public static void main(String[] args) {
        Produto novoProduto = new Produto("Caderno", 20,50);

        novoProduto.vender(10);
        novoProduto.exibirProduto();
        novoProduto.reporEstoque(10);
        novoProduto.exibirProduto();
    }
}
