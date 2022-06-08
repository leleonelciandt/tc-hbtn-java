public class FolhaPagamento {

    public static double calcularLiquido(Funcionario f, CalculadorDeSalario calculadorDeSalario){
        return calculadorDeSalario.calcular(f.getSalario());
    }

}
