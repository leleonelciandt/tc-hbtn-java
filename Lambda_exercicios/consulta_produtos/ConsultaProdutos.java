import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    List<Produto> produtos;

    public ConsultaProdutos(ArrayList<Produto> produtos) {
        this.produtos = new ArrayList<>();
    }

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro){

        List<Produto> produtosFiltrados = new ArrayList<>();

        produtos.forEach(produto -> {
            if (criterioFiltro.testar(produto)) {
                produtosFiltrados.add(produto);
            }
        });
        return produtosFiltrados;

    }



}
