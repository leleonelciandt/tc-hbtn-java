import java.util.ArrayList;
import java.util.HashMap;


public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> contato;

    public ListaTelefonica(){
        this.contato = new HashMap<>();
    }


    public void adicionarTelefone(String nome, Telefone telefone){
       if (contato.containsKey(nome)){
           ArrayList<Telefone> dados = contato.get(nome);
           dados.add(telefone);
           contato.put(nome, dados);
       } else {
           ArrayList<Telefone> dados = new ArrayList<>();
           dados.add(telefone);
           contato.put(nome, dados);
       }
    }

    public  ArrayList<Telefone> buscar(String nome) {
        if (contato.containsKey(nome)) {
            return contato.get(nome);
        }
        return null;
    }


}
