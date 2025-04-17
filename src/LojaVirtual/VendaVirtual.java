package LojaVirtual;

import SistemaPedidos.Produto;

import java.util.Scanner;

public class VendaVirtual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CarrinhoVirtual carrinho = new CarrinhoVirtual();
        boolean continuar = true;

        while(continuar){
            System.out.println("Menu de compras");
            System.out.println("1 -  cadastrar Produtos e adicionar ao carrinho");
            System.out.println("2 -  ver o Carrinho");
            System.out.println("3 -  Aplicar desconto aos Produtos");
            System.out.println("4 -  sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scan.nextInt();

            scan.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome do produto: ");
                    String nomeProduto = scan.nextLine();

                    System.out.println("Preço do produto: ");
                    double precoProduto = scan.nextDouble();
                    scan.nextLine();

                    ProdutoVirtual produto = new ProdutoVirtual(nomeProduto, precoProduto);
                    carrinho.adicionarProdutos(produto);
                    break;
                case 2:
                    carrinho.mostrarCarrinho();
                    break;
                case 3:
                    System.out.println("Digite o desconto(%):");
                    double desconto = scan.nextDouble();
                    scan.nextLine();

                    carrinho.aplicarDesconto(desconto);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        scan.close();
    }
}
