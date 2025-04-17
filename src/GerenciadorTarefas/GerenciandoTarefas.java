package GerenciadorTarefas;

import SistemaPedidos.Produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciandoTarefas {
    public static void main(String[] args) {
        ArrayList<Tarefa> tarefas =  new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("====MENU DE TAREFAS====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - sair");
            System.out.println("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite a descrição da tarefa a ser feita: ");
                    String descricao =  scan.nextLine();

                    System.out.print("Data da tarefa (formato: yyyy-MM-dd): ");
                    String dataString = scan.nextLine();
                    LocalDate data = LocalDate.parse(dataString);

                    System.out.println("Status da tarefa:");
                    for (StatusTarefa status : StatusTarefa.values()){
                        System.out.println(" - "+status);
                    }

                    System.out.println("Digite o status: ");
                    StatusTarefa status = StatusTarefa.valueOf(scan.nextLine().toUpperCase());

                    System.out.println("Prioridade da Tarefa:");
                    for (PrioridadeTarefa p : PrioridadeTarefa.values()){
                        System.out.println(" - "+p);
                    }

                    System.out.println("Digite a prioridade: ");
                    PrioridadeTarefa prioridade = PrioridadeTarefa.valueOf(scan.nextLine().toUpperCase());

                    Tarefa novaTarefa = new Tarefa(descricao, data,prioridade, status);
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso! ");
                    break;
                case 2:
                    if (tarefas.isEmpty()){
                        System.out.println("Não existe nehuma tarefa!");
                    }else {
                        System.out.println("==Lista de Tarefas==");
                        for(Tarefa t : tarefas){
                            t.exibirDetalhes();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }while (opcao !=3);

        scan.close();
    }
}
/*
valueOf - usado para converter uma String em um valor de enum ou de outro tipo de objeto.
Em enum ele é muito usado pra pegar valor correspondente de uma String digitada pelo usuário

values - retorna um array com todos os valores definidos naquele enum
 */