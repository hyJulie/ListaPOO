package Agenda;

import java.util.ArrayList;

public class Agenda {
   private ArrayList<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public void adicionarContatos(Contato contato){
            contatos.add(contato);
            System.out.println("Contato adicionado com sucesso!");
    }

    public void removerContatos(String nome){
        boolean removido = false; //começa com o valor falso

        for (int i = 0; i < contatos.size();i++){
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)){
                contatos.remove(i);
                System.out.println("Contato removido com sucesso");
                removido = true;
                break;
            }
        }

        if (!removido){
            System.out.println("Contato não existe");
        }
    }

    public void listarContatos(){
        if (contatos.isEmpty()){
            System.out.println("Agenda vazia");
        }else {
            System.out.println("Contatos na agenda: ");
            for (Contato c : contatos){
                c.exibirContatos();
            }
        }
    }

}
/*
O método equalsIgnoreCase() retorna um valor booleano.
Se o argumento não for nulo e o conteúdo for o mesmo, ignorando o caso, ele retorna true.
Caso contrário, falso.
 */