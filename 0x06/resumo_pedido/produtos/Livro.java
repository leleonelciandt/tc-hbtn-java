package produtos;

public class Livro extends Produto {
    public int paginas, edicao;
    public String autor;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao){
        super(titulo, ano, pais, precoBruto);
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }

    @Override
    public double obterPrecoLiquido(){
        return this.precoBruto * 1.15;
    }



}
