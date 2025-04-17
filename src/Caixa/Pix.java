package Caixa;

public class Pix implements Pagamento{

    @Override
    public boolean pagar(double valor) {
        System.out.printf("Tranferência de R$ %.2f via pix realizada com sucesso!\n",valor);
        return true;
    }
}
