package SistemaPedidos;

public class Pedido {
    private Cliente cliente;
    private Carrinho carrinho;

    public Pedido(Cliente cliente, Carrinho carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public void resumoPedido(){
        System.out.println("----Resumo do Pedido----");
        System.out.println("Cliente: "+cliente.getNomeCliente());
        carrinho.exibirProdutos();
        System.out.println("Total do Pedido: R$"+carrinho.calcularTotal());

    }
}
