import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {


        float taxa = 0.2456f;
        float valor = 7654.321f;

        Locale localeUS = new Locale("en","US");
        NumberFormat newValor = NumberFormat.getInstance(localeUS);

        newValor.setMaximumFractionDigits(2);

        System.out.println("Valor: R$ " + newValor.format(valor));

        System.out.printf("Taxa: %.02f%% ", taxa);

    }
}