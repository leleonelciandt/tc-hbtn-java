import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {


        float taxa = 0.2456f;
        float valor = 7654.321f;


        String dec = new DecimalFormat("#,###.##", new DecimalFormatSymbols(Locale.ENGLISH)).format(valor);


        System.out.println("Valor: R$ " + dec);
        System.out.printf("Taxa: %.02f%% ", taxa);

    }
}