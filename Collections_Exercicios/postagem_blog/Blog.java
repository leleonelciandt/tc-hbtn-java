import java.util.*;

public class Blog {

    private ArrayList<Post> listaPostagens;

    public Blog() {
        this.listaPostagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post post){
        if (listaPostagens.contains(post)){
            throw new IllegalArgumentException("Postagem jah existente");
        }
        this.listaPostagens.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> todosAutores = new TreeSet<>();

        for (Post post : listaPostagens) {
            todosAutores.add(post.getAutor());
        }
        return todosAutores;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsPorAutor = new TreeSet<>();

        for (Post post : listaPostagens) {
            if (post.getAutor().equals(autor)) {
                postsPorAutor.add(post);
            }
        }
        return postsPorAutor;
    }


    public Map<Categorias, Integer> obterContagemPorCategoria(){

        Map<Categorias, Integer> contagemCategoria = new TreeMap<>();

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


    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> returnPosts = new TreeSet<>();

        for (Post post : listaPostagens) {
            if (post.getCategoria().equals(categoria)) {
                returnPosts.add(post);
            }
        }

        return returnPosts;
    }

    public Map<Categorias,Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias,Set<Post>> todosPostsPorCategoria = new TreeMap<>();

        for (Post post : listaPostagens) {
            if (todosPostsPorCategoria.containsKey(post.getCategoria())) {
                Set<Post> v = todosPostsPorCategoria.get(post.getCategoria());
                v.add(post);
                todosPostsPorCategoria.put(post.getCategoria(), v);
            } else {
                Set<Post> v = new TreeSet<>();
                v.add(post);
                todosPostsPorCategoria.put(post.getCategoria(), v);
            }
        }
        return todosPostsPorCategoria;
    }

    public Map<Autor,Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor,Set<Post>> todosPostsPorAutor = new TreeMap<>();

        for (Post post : listaPostagens) {
            if (todosPostsPorAutor.containsKey(post.getAutor())) {
                Set<Post> v = todosPostsPorAutor.get(post.getAutor());
                v.add(post);
                todosPostsPorAutor.put(post.getAutor(), v);
            } else {
                Set<Post> values = new TreeSet<>();
                values.add(post);
                todosPostsPorAutor.put(post.getAutor(), values);
            }
        }

        return todosPostsPorAutor;
    }


}