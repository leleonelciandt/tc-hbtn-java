import java.text.NumberFormat;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;

        NumberFormat z = NumberFormat.getCurrencyInstance();
        String percent = "% ";

        System.out.println("Valor: R" + z.format(valor));
        System.out.printf("Taxa: %.02f%s ", taxa, percent);
    }
}