package Caixa;

public class Boleto implements Pagamento{

    @Override
    public boolean pagar(double valor) {
        System.out.printf("O boleto foi gerado! Pague R$ %.2f até a data de vencimento.\n",valor);
        return true;
    }
}
