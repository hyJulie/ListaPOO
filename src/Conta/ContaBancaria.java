package Conta;

public class ContaBancaria {
    private final int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0; //saldo vai começar zerado
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Valor de R$"+valor+" depositado na conta.");
        }else {
            System.out.println("O valor precisa ser positivo");
        }
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente!!");
        }else if (valor > 0){
            saldo -= valor;
            System.out.println("Saque de R$"+valor+" realizado.");
        }else {
            System.out.println("O valor do saque deve ser positivo");
        }
    }

    public void saldoAtual(){
        System.out.println("Saldo Atual: "+this.saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
/*
depositar
    começar vendo se o saldo é positivo e depois por o valor depositar no saldo
 */