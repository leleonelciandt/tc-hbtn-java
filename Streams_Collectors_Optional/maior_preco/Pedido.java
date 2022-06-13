import java.util.ArrayList;
import java.util.List;

public class Pedido {


    private int codigo;
    private List<Produto> produtos;
    private Cliente cliente;


    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}