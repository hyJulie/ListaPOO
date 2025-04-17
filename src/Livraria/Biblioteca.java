package Livraria;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public void addLivros(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void buscaTitulo(String tituloBusca){
        boolean encontrado = false;
        for (Livro livro : livros){ //para buscar algo usar o forEach
            if (livro.getTitulo().equalsIgnoreCase(tituloBusca)){
                System.out.println("Título encontrado!");
                livro.exibirInfo();
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("Título não existe.");
        }
    }

    public void listarLivros(){
        if (livros.isEmpty()){
            System.out.println("Não existe nenhum livro.");
        }else {
            System.out.println("Livros registrados: ");
            for (Livro livro : livros){
                livro.exibirInfo();
                System.out.println("'---------");
            }
        }
    }
}
