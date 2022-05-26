import provedores.Frete;
import provedores.ProvedorFrete;
import provedores.TipoProvedorFrete;

public class ProcessadorPedido {
    ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete){
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido){
        pedido.setFrete(this.provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));
    }

}
