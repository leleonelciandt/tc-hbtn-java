public class PrintFormatacaoNumeros {
     import java.text.NumberFormat;
     import java.util.Locale;

    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;

        Locale localeUS = new Locale("en","US");

        NumberFormat valorMoedaLocal = NumberFormat.getCurrencyInstance(localeUS);

        System.out.println("Valor: R$ " + valor.format(valorMoedaLocal));
        SYstem.out.println("Taxa: %.02f", taxa + "%" );
    }
}