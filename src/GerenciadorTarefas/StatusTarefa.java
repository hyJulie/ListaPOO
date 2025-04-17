package GerenciadorTarefas;

public enum StatusTarefa {
    PENDENTE("Ainda está sendo feita."),
    CONCLUIDA("Já terminada.");

    private String descricao;

    StatusTarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
