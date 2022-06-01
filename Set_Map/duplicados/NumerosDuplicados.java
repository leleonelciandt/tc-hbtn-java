import java.util.HashSet;
import java.util.TreeSet;


public class NumerosDuplicados {


    public static TreeSet<Integer> buscar(int[] inteiros) {

        TreeSet<Integer> duplicatedIntegers = new TreeSet<>();
        HashSet<Integer> uniqueIntegers = new HashSet<>();

        for (int inteiro : inteiros) {
            if (uniqueIntegers.contains(inteiro)) {
                duplicatedIntegers.add(inteiro);
            }
            uniqueIntegers.add(inteiro);
        }
        return duplicatedIntegers;
    }


}


