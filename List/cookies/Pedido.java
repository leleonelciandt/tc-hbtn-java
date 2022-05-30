import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int totalCaixas = 0;
        for (PedidoCookie pedido : this.cookies) {
            totalCaixas += pedido.getQuantidadeCaixas();
        }
        return totalCaixas;
    }

    public int removerSabor(String saborCookie) {
        Iterator<PedidoCookie> iterator = this.cookies.iterator();
        int totalCookies = 0;

        while(iterator.hasNext()) {
            PedidoCookie pedido = iterator.next();
            if (pedido.getSabor().equals(saborCookie)) {
                totalCookies += pedido.getQuantidadeCaixas();
                iterator.remove();
            }
        }

        return totalCookies;
    }
}