import java.util.*;

public class Blog {

    List<Post> listaPostagens;

    public Blog() {
        this.listaPostagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post post){
        this.listaPostagens.add(post);
    }

    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<String>();

        for (Post post : listaPostagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){

        Map<String, Integer> contagemCategoria = new TreeMap<String, Integer>();

        for (Post post : listaPostagens) {
            if (contagemCategoria.containsKey(post.getCategoria())) {
                Integer count = contagemCategoria.get(post.getCategoria());
                contagemCategoria.put(post.getCategoria(), count + 1);
            } else {
                contagemCategoria.put(post.getCategoria(), 1);
            }
        }
        return contagemCategoria;

    }

}

