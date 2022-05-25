public class Pedido {

    private double percentualDesconto;
    public ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens){
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double sum = 0;
        for (ItemPedido item : itens) {
            sum += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        return sum * (1 - (this.percentualDesconto / 100));
    }

}
