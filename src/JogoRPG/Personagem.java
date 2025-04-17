package JogoRPG;

public abstract class Personagem {
    protected String nome;
    protected int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract int atacar();
    public abstract void defender(int dano);

    public void mostrarStatus(){
        System.out.println("Nome: "+nome+" | vida: "+vida);
    }

    public boolean estaVivo(){
        return vida > 0;
    }
}
