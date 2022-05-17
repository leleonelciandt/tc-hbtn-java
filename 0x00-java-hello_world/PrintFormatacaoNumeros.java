import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {


        float taxa = 0.2456f;
        float valor = 7654.321f;

        Locale localeBR = new Locale("pt","BR");
        NumberFormat newValor = NumberFormat.getCurrencyInstance(localeBR);
        String percent = "%";

        System.out.println("Valor: " + newValor.format(valor));
        System.out.printf("Taxa: %.02f%s ", taxa, percent);
    }
}