package Livraria.test;

import Livraria.Biblioteca;
import Livraria.Livro;

import java.util.Scanner;

public class VendaLivros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do {
            System.out.println("------Biblioteca------");
            System.out.println("1 - Adicionar Livros ");
            System.out.println("2 - Buscar Título de livro");
            System.out.println("3 - Listar livros");
            System.out.println("4 -  sair");
            System.out.println("Escolha a opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Título: ");
                    String titulo = scan.nextLine();
                    System.out.println("Autor: ");
                    String autor = scan.nextLine();
                    System.out.println("Ano: ");
                    int ano = scan.nextInt();
                    scan.nextLine();
                    Livro livro = new Livro(titulo,autor,ano);
                    biblioteca.addLivros(livro);
                    break;
                case 2:
                    System.out.println("Digite o título do livro que deseja buscar: ");
                    String busca = scan.nextLine().trim();
                    biblioteca.buscaTitulo(busca);
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 4:
                    System.out.println("Tchauu");
                    break;
                default:
                    System.out.println("Opção não existe!");
                    break;
            }

        }while(opcao != 4);


        scan.close();
    }
}
