import java.util.ArrayList;

public class Biblioteca <T extends Midia>{
    ArrayList<T> listaMidias = new ArrayList<>();

    public Biblioteca() {}

    public ArrayList<T> getListaMidias() {
        return listaMidias;
    }

    public void adicionarMidia(T midia) {
        listaMidias.add(midia);
    }

    public ArrayList<T> obterListaMidias() {
        return listaMidias;
    }
}
