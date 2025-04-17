package GerenciadorTarefas;

public enum PrioridadeTarefa {
    BAIXO("Não é importante para ser concluida rapidamente."),
    MEDIO("importante."),
    ALTO("Muito importante, e tem que ser feita com urgência.");

    private String descricao;

    PrioridadeTarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
