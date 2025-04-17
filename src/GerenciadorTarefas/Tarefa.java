package GerenciadorTarefas;

import java.time.LocalDate;

public class Tarefa {
    private String descricao;
    private LocalDate data;
    private PrioridadeTarefa prioridade;
    private StatusTarefa status;

    public Tarefa(String descricao, LocalDate data, PrioridadeTarefa prioridade, StatusTarefa status) {
        this.descricao = descricao;
        this.data = data;
        this.prioridade = prioridade;
        this.status = status;
    }

    public void exibirDetalhes(){
        System.out.println("====Detalhes da Tarefa====");
        System.out.println("Data: "+data);
        System.out.println("Descrição da Tarefa: "+descricao);
        System.out.println("Status: "+status+" - "+status.getDescricao());
        System.out.println("Prioridade: "+prioridade+" - "+prioridade.getDescricao());
    }
}
