package Caixa;

public class CartaoDeCredito implements Pagamento{
    private double limite;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean pagar(double valor) {
        if (valor <= limite){
            limite -= valor;
            System.out.printf("Pagamento com Cartão de Crédito aprovado! valor: R$ %.2f\n",valor);
            return true;
        }else {
            System.out.println("Pagamento não aprovado.");
            return false;
        }
    }
}
