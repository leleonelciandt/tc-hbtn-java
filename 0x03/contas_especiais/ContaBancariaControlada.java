public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo, valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }


    //sobrescreva o método aplicarAtualizacaoMensal para aplicar a penalidade caso o saldo esteja abaixo do saldo mínimo ou igual a zero.
    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();

        if (this.getSaldo() < this.saldoMinimo || this.getSaldo() == 0) {
            this.saldo -= this.valorPenalidade;
        }
    }



}
