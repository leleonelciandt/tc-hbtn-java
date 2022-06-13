import java.util.TreeSet;

public class Pessoa implements Comparable<Pessoa>{

    private int codigo, idade;
    private String nome, cargo;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.idade = idade;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }


    public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }


    @Override
    public String toString() {
        return "[" + this.codigo + "] " + this.nome + " " + this.cargo + " " + this.idade + " R$ " + String.format("%.6f", this.salario);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        return codigo == pessoa.codigo;
    }

    @Override
    public int hashCode() {
        return codigo;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }


}
