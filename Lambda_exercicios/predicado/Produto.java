public class Produto {

    private String nome;
    private double preco, peso;
    private int quantidadeEmEstoque;
    private TiposProduto tipo;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        setNome(nome);
        setPreco(preco);
        setPeso(peso);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
        setTipo(tipo);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setTipo(TiposProduto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("%s %6f %6f %d %s", getNome(), getPreco(), getPeso(), getQuantidadeEmEstoque(), getTipo());
    }
}