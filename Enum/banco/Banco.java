import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nomeBanco) {
        this.nome = nomeBanco;
        agencias = new ArrayList<Agencia>();
    }

    public String getNome() {
        return nome;
    }


    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }


    private Agencia buscarAgencia(String nomeAgencia){
        for (Agencia agencia : agencias) {
            if (agencia.getNome().equals(nomeAgencia)){
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia){
        if (buscarAgencia(nomeAgencia) != null){
            return false;
        }
        this.agencias.add(new Agencia(nomeAgencia));
        return true;
    }


    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        if (buscarAgencia(nomeAgencia) == null) {
            return false;
        }
        if (buscarAgencia(nomeAgencia).buscarCliente(nomeCliente) == null) {
            buscarAgencia(nomeAgencia).novoCliente(nomeCliente, valorTransacao);
            return true;
        }

        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double transacao) {
        if (buscarAgencia(nomeAgencia) == null) {
            return false;
        }
        if (buscarAgencia(nomeAgencia).buscarCliente(nomeCliente) == null) {
            return false;
        }
        buscarAgencia(nomeAgencia).adicionarTransacaoCliente(nomeCliente, transacao);
        return true;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes) {
        if (buscarAgencia(nomeAgencia) == null) {
            return false;
        }

        ArrayList<Cliente> clientes = buscarAgencia(nomeAgencia).getClientes();

        for (Cliente cliente : clientes) {
            System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), clientes.indexOf(cliente) + 1);

            if (imprimeTransacoes) {
                ArrayList<Double> transacoes = cliente.getTransacoes();
                for (Double transacao : transacoes) {
                    String valor = String.format("%.2f", transacao).replace(",", ".");
                    System.out.printf("  [%d] valor %s\n", transacoes.indexOf(transacao) + 1, valor);
                }
            }
        }
        return true;
    }



}
