public class Post {

    String autor, titulo, corpo, categoria;

    public Post(String autor, String titulo, String corpo, String categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getCorpo() {
        return corpo;
    }


    public String getCategoria() {
        return categoria;
    }

}
