package Relogio;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelogioDigital {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); //definir o formato

        while(true){
            LocalTime hora = LocalTime.now();
            String horaFormatada  = hora.format(formatter);
            System.out.println("Hora atual: "+horaFormatada);

            try{
                Thread.sleep(1000); //faz parar por 1 segundo, pausar o código por um tempo antes de continuar
            }catch (InterruptedException e){ // pode acontecer um erro se alguém interromper a execução da thread
                System.out.println("Erro ao esperar");
            }
        }
    }
}
/*
Tente {
    Dormir por 1 segundo.
} Caso aconteça algum erro durante esse sono {
    Mostrar a mensagem "Erro ao esperar."
}

Thread é como uma linha de execução dentro de um programa
como se fosse um funcionário que está executando uma tarefa
Um programa pode ter vários funcionários (threads) trabalhando ao mesmo tempo
Essas tarefas podem acontecer ao mesmo tempo, sem uma travar a outra, é isso que uma Thread permite: executar várias coisas em paralelo
 */