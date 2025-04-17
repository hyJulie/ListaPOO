package Caixa.test;

import Caixa.Boleto;
import Caixa.CartaoDeCredito;
import Caixa.Pagamento;
import Caixa.Pix;

import java.util.Scanner;

public class Pagando {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escolha o valor a ser pago: R$");
        double valor = scan.nextDouble();

        System.out.println("----Métodos de Pagamento----");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2 - Pix");
        System.out.println("3 - Boleto");
        System.out.println("Escolha o método: ");
        int opcao = scan.nextInt();

        Pagamento pagamento = null; //começar com null pq não sabemos qual método de pagamento o usário escolheu ainda

        switch (opcao){
            case 1:
                pagamento = new CartaoDeCredito(1000); //limite inicial
                break;
            case 2:
                pagamento = new Pix();
                break;
            case 3:
                pagamento = new Boleto();
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);//encerra imediatamento o programa, o 0 quer dizer que saiu com sucesso
        }

        pagamento.pagar(valor);
        scan.close();
    }
}
