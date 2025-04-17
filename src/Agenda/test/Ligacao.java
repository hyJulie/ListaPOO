package Agenda.test;

import Agenda.Agenda;
import Agenda.Contato;

import java.util.Scanner;

public class Ligacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;

        do {
            System.out.println("1 - Adicionar contatos");
            System.out.println("2 - remover contatos");
            System.out.println("3 - listar contatos");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine(); //limpar o buffer do console

            switch(opcao){
                case 1:
                    System.out.println("Nome: ");
                    String nome = scan.nextLine();
                    System.out.println("Telefone: ");
                    String telefone = scan.nextLine();
                    Contato novoContato = new Contato(nome, telefone);
                    agenda.adicionarContatos(novoContato);
                    break;
                case 2:
                    System.out.println("Digite o nome do contato que deseja remover: ");
                    String removeContato = scan.nextLine();
                    agenda.removerContatos(removeContato);
                    break;
                case 3:
                    agenda.listarContatos();
                    break;
                case 4:
                    System.out.println("Bye Bye...");
                    break;
                default:
                    System.out.println("Opção não existe");
            }
        }while (opcao != 4);

        scan.close();
    }
}
