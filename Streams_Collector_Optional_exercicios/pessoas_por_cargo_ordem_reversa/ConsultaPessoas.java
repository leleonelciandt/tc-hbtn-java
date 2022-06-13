import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> listPessoas){

        Supplier<TreeMap<String, TreeSet<Pessoa>>> novaLista = () -> new TreeMap<>(Comparator.reverseOrder());
        return listPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, novaLista, Collectors.toCollection(TreeSet::new)));

    }

}
