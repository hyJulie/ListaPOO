package JogoRPG;

public class Guerreiro extends Personagem{
    public Guerreiro(String nome) {
        super(nome, 120);
    }

    @Override
    public int atacar() {
        System.out.println(nome+" ataca com sua espada!");
        return 15;
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano - 8;
        vida -= (Math.max(danoReduzido, 0));//retorna o maior valor entre os dois argumentos
        System.out.println(nome+" usa seu escudo de carvalho e recebe "+(Math.max(danoReduzido,0))+" de dano!");
    }
}
