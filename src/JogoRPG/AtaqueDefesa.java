package JogoRPG;

import java.util.Scanner;

public class AtaqueDefesa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Mago mago = new Mago("Gandalf");
        Guerreiro guerreiro = new Guerreiro("Thorin escudo de carvalho");

        System.out.println("==== Batalha Iniciada ====");

        int turno = 1; //turno de batalha e vai aumento enquanto os dois estiverem vivos
        while (mago.estaVivo()&& guerreiro.estaVivo()){
            System.out.println("\n--- Turno " + turno + " ---");
            System.out.println("Escolha o atacante: (1 - Mago, 2 - Guerreiro)");
            int escolha = scan.nextInt();

            if (escolha == 1){
               int dano =  mago.atacar();
                guerreiro.defender(dano);
            }else if (escolha == 2){
                int dano = guerreiro.atacar();
                mago.defender(dano);
            }else {
                System.out.println("Escolha inválida, perdeu a vez!");
            }

            mago.mostrarStatus();
            guerreiro.mostrarStatus();
            turno++;
        }

        System.out.println("\n==== Fim da Batalha ====");
        if (mago.estaVivo()){
            System.out.println(mago.nome+" venceu a batalha!");
        }else{
            System.out.println(guerreiro.nome+" venceu a batalha!");
        }

        scan.close();
    }
}
