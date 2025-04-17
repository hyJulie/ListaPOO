package Loja.test;

import Loja.Produto;

import java.util.Scanner;

public class VendasScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do Produto: ");
        String nome = scan.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = scan.nextDouble();

        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = scan.nextInt();

        Produto produto = new Produto(nome,preco,quantidade);
        scan.nextLine();

        int opcao;

        do {

            System.out.println("-----Vendas-----");
            System.out.println("1 - Exibir Produto");
            System.out.println("2 - Vender Produto");
            System.out.println("3 - repor estoque");
            System.out.println("4 - sair");
            System.out.println("Escolha a opção: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("-----Exibindo resultados-----");
                    produto.exibirProduto();
                    break;
                case 2:
                    System.out.println("Digite quantidade que deseja ser vendida: ");
                    int qtdVenda = scan.nextInt();
                    produto.vender(qtdVenda);
                    break;
                case 3:
                    System.out.println("Digite a quantida a ser reposta: ");
                    int qtdrepor = scan.nextInt();
                    produto.reporEstoque(qtdrepor);
                    break;
                case 4:
                    System.out.println("Tchau...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 4);

        scan.close();
    }
}
