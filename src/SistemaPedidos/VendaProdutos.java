package SistemaPedidos;

import java.util.Scanner;

public class VendaProdutos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //os produtos fixos no catalogo
        Produto[] catalogo = {
            new Produto("camisa", 20),
            new Produto("tênis adidas", 150),
            new Produto("bermuda esportiva",40),
            new Produto("Boné Fluminense", 30)
        };

        //agora cadastro do cliente
        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = scan.nextLine();
        Cliente cliente = new Cliente(nomeCliente);
        Carrinho carrinho = new Carrinho();

        //agora vai exibir o catalogo
        for (int i = 0; i < catalogo.length;i++){
            System.out.println((i + 1)+". "+catalogo[i].getNome()+"- R$"+catalogo[i].getPreco());
        }

        //agora pra adicionar produtos no carrinho
        String continuar;
        do {
            System.out.println("Digite o número do Produto que quer escolher:");
            int opcao = scan.nextInt();

            if (opcao >=1 && opcao <= catalogo.length){
                carrinho.adicionarProdutos(catalogo[opcao - 1]);
                System.out.println("Produto adicionado ao carrinho");
            }else {
                System.out.println("Produto inválido");
            }

            System.out.println("Deseja adicionar algum outro Produto? (s/n)");
            scan.nextLine();
            continuar = scan.nextLine().trim().toLowerCase();
        }while (continuar.equals("s"));

       Pedido pedido = new Pedido(cliente, carrinho);
       pedido.resumoPedido();

       scan.close();

    }
}
/*
catalogo[opcao - 1] = isso é pq no array sempre começa pelo indice 0
 */