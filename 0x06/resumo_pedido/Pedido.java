public class Pedido {

    private double percentualDesconto;
    public ItemPedido[] itens;
    private double sum;

    public Pedido(int percentualDesconto, ItemPedido[] itens){
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        this.sum = 0.0;
        for (ItemPedido item : itens) {
            this.sum += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        return this.sum * (1 - (this.percentualDesconto / 100));
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido pedido : this.itens) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %s  Quant: %s  Total: %s", pedido.getProduto().getClass().getSimpleName(),
                    pedido.getProduto().getTitulo(),
                    this.convertDouble(pedido.getProduto().obterPrecoLiquido()),
                    pedido.getQuantidade(),
                    this.convertDouble(pedido.getQuantidade() * pedido.getProduto().obterPrecoLiquido()) +"\n");
        }
        System.out.println("----------------------------");
        this.calcularTotal();
        System.out.println("DESCONTO: " + this.convertDouble(this.sum * (this.percentualDesconto / 100.0)));
        System.out.println("TOTAL PRODUTOS: " + this.convertDouble(this.sum));
        System.out.println("----------------------------");
        System.out.println("TOTAL PEDIDO: " + this.convertDouble(this.calcularTotal()));
        System.out.println("----------------------------");
    }

    private String convertDouble(Double valor) {
        String valorStr = String.format("%.2f", valor);
        return valorStr.replace('.', ',');
    }
}
