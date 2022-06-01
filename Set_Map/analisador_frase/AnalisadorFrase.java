import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase){

        TreeMap<String, Integer> mapPalavras = new TreeMap<String, Integer>();
        String fraseFormatada = frase.replaceAll("[?.!]", "");
        String[] novaFrase = fraseFormatada.split(" ");

        for (String palavra : novaFrase) {
            if (mapPalavras.containsKey(palavra.toLowerCase())) {
                mapPalavras.put(palavra.toLowerCase(), mapPalavras.get(palavra.toLowerCase()) + 1);
            } else {
                mapPalavras.put(palavra.toLowerCase(), 1);
            }
        }
        return mapPalavras;
    }


    // The [] replace a group of characters;

}


