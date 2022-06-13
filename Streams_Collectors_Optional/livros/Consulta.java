import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido (Pedido pedido){

        List<Produto> prodPedido = pedido.getProdutos();

        return prodPedido.stream()
                .filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

    }

}
