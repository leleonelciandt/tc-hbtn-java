public class Autor implements Comparable<Autor>{
    private String nome, sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + sobrenome.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Autor autor = (Autor) obj;

        if (!nome.equals(autor.nome)) return false;
        return sobrenome.equals(autor.sobrenome);
    }


    public int compareTo(Autor other) {
        if (this.nome.compareTo(other.nome) == 0) {
            return this.sobrenome.compareTo(other.sobrenome);
        } else {
            return this.nome.compareTo(other.nome);
        }
    }
}
