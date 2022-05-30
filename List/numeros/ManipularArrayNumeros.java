
import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> list, int num) {
        if (list.contains(num)) {
            return list.indexOf(num);
        } else {
            return -1;
        }

    }

    public static void adicionarNumero(List<Integer> list, int i) throws Exception {
        if (buscarPosicaoNumero(list, i) != -1) {
            throw new Exception("Numero jah contido na lista");
        } else {
            list.add(i);
        }
    }

    public static void removerNumero(List<Integer> list, Integer i) throws Exception {
        if (buscarPosicaoNumero(list, i) == -1) {
            throw new Exception("Numero nao encontrado na lista");
        } else {
            list.remove(i);
        }
    }

    public static void substituirNumero(List<Integer> list, int numeroSubstituir, int numeroSubstituto) {
        int index = buscarPosicaoNumero(list, numeroSubstituir);
        if (index == -1) {
            list.add(numeroSubstituto);
        } else {
            list.set(index, numeroSubstituto);
        }
    }
}
