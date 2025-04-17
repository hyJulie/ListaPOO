package JogoRPG;

public class Mago extends Personagem{
    public Mago(String nome) {
        super(nome, 88);
    }

    @Override
    public int atacar() {
        System.out.println(nome+" ataca com seus poderes e cajado mágico!");
        return 20;
    }

    @Override
    public void defender(int dano) {
       int danoReduzido = dano - 5;
       vida -= (Math.max(danoReduzido, 0));//retorna o maior valor entre os dois argumentos
        System.out.println(nome+" usa escudo mágico e recebe "+(Math.max(danoReduzido,0))+" de dano!");
    }
}
