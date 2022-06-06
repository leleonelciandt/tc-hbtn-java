import java.util.*;

public class Blog {

    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post post){
        this.postagens.add(post);
    }

    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<>();

        for (Post post : postagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){

        Map<String, Integer> contagemCategoria = new TreeMap<String, Integer>();

        for (Post post : postagens) {
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

