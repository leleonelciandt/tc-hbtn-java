import provedores.Frete;

public class Pedido {
    int codigo;
    Double peso, total;
    Frete frete;


    public Pedido(int codigo, double peso, double total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public Frete getFrete() {
        return frete;
    }

    public double getPeso() {
        return peso;
    }

    public double getTotal() {
        return total;
    }
}
