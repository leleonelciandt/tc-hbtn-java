import java.text.NumberFormat;
import java.util.Locale;

public class Empregado {
    public double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        if (departamento.getValorAtingidoMeta() >= departamento.getValorMeta()) {
            return salarioFixo * 0.1;
        } else {
            return 0;
        }
    }

    public double calcularSalarioTotal(Departamento departamento){
        return getSalarioFixo() + calcularBonus(departamento);
    }


}
