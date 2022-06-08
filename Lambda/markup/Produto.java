import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    /*Crie a classe Produto:

    Possui os atributos nome, preco e percentualMarkup com valor inicial de 10 (10%).
    Inclua um atributo Supplier com nome precoComMarkup que retorne um valor Double com o preço do produto acrescido do índice de markup.
    Inclua um atributo Consumer com o nome atualizarMarkup que recebe um valor Double e modifica o valor do atributo percentualMarkup do objeto.*/


    private String nome;
    private double preco, percentualMarkup;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 10;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }

    public Supplier<Double> precoComMarkup = () -> this.preco * (1 + (this.percentualMarkup / 100));

    Consumer<Double> atualizarMarkup = (Double v) -> this.setPercentualMarkup(v);



}
