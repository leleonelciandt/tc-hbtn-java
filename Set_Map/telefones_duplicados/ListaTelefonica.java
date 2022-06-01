import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> contato;

    public ListaTelefonica(){
        this.contato = new HashMap<>();
    }


    public void adicionarTelefone(String nome, Telefone telefone){
        contato.forEach((key, value) -> {
            if (key.equals(nome) && value.contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            } else if (!key.equals(nome) && value.contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        });

        if (contato.containsKey(nome)){
            HashSet<Telefone> dados = contato.get(nome);
            dados.add(telefone);
            contato.put(nome, dados);
        } else {
            HashSet<Telefone> dados = new HashSet<>();
            dados.add(telefone);
            contato.put(nome, dados);
        }
    }


    public  HashSet<Telefone> buscar(String nome) {
        if (contato.containsKey(nome)) {
            return contato.get(nome);
        }
        return null;
    }


}