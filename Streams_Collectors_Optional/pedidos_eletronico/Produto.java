public class Produto {


    private int codigo;
    private String nome;
    private double preco;
    private CategoriaProduto categoria;

    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "[" + this.codigo + "] " + this.nome + " " + this.categoria + " R$ " + String.format("%.2f", this.preco);
    }
}