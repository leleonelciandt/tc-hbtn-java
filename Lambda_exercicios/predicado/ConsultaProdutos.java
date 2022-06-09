import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    List<Produto> produtos;

    public ConsultaProdutos(ArrayList<Produto> produtos) {
        this.produtos = new ArrayList<>();
    }

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterioFiltro){

        List<Produto> produtosFiltrados = new ArrayList<>();

        produtos.forEach(produto -> {
            if (criterioFiltro.test(produto)) {
                produtosFiltrados.add(produto);
            }
        });
        return produtosFiltrados;

    }



}