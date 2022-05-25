public class Program {
    public static void main(String[] args) {
        produtos.Livro livro1 = new produtos.Livro("Duna", 2017, "Brasil", 56.30, 680, "Frank Herbert", 1);
        produtos.Livro livro2 = new produtos.Livro("Um de nós está mentindo", 2018, "Brasil", 34.93, 384,
                "Karen Mcmanus", 1);
        produtos.Livro livro3 = new produtos.Livro("Mindset Milionário", 2021, "Brasil", 31.70, 272,
                "José Roberto Marques", 1);

        produtos.Dvd dvd1 = new produtos.Dvd("Anjos da Noite 5 - Guerras de Sangue", 2016, "Estados Unidos", 16.90,
                "Anna Foerster",
                "Ação", 91);
        produtos.Dvd dvd2 = new produtos.Dvd("Annabelle 2 - A Criação do Mal", 2017, "Brasil", 39.90,
                "Jame Wan e Peter Safran",
                "Terror",
                109);


        // Pedido 1
        ItemPedido[] itensPedido1 = new ItemPedido[] {
                new ItemPedido(livro1, 1),
                new ItemPedido(dvd2, 1)
        };

        Pedido pedido1 = new Pedido(0, itensPedido1);
        String totalPedido1 = Double.toString(pedido1.calcularTotal());
        int index1 = totalPedido1.indexOf(".");
        totalPedido1 = totalPedido1.substring(0, index1 + 3);

        System.out.println("Total Pedido: " + totalPedido1.replace('.', ','));


        // Pedido 2
        ItemPedido[] itensPedido2 = new ItemPedido[] {
                new ItemPedido(livro1, 1),
                new ItemPedido(dvd2, 1)
        };

        Pedido pedido2 = new Pedido(10, itensPedido2);
        String totalPedido2 = Double.toString(pedido2.calcularTotal());
        int index2 = totalPedido2.indexOf(".");
        totalPedido2 = totalPedido2.substring(0, index2 + 3);

        System.out.println("Total Pedido: " + totalPedido2.replace('.', ','));

        // Pedido 3
        ItemPedido[] itensPedido3 = new ItemPedido[] {
                new ItemPedido(livro2, 1),
                new ItemPedido(livro3, 2),
                new ItemPedido(dvd1, 1)
        };

        Pedido pedido3 = new Pedido(5, itensPedido3);
        String totalPedido3 = Double.toString(pedido3.calcularTotal());
        int index3 = totalPedido3.indexOf(".");
        totalPedido3 = totalPedido3.substring(0, index3 + 3);
        System.out.println("Total Pedido: " + totalPedido3.replace('.', ','));


        // Pedido 4
        ItemPedido[] itensPedido4 = new ItemPedido[] {
                new ItemPedido(livro2, 1),
                new ItemPedido(livro2, 1),
                new ItemPedido(livro3, 2),
                new ItemPedido(dvd1, 1),
                new ItemPedido(dvd2, 2)
        };

        Pedido pedido4 = new Pedido(5, itensPedido4);
        String totalPedido4 = Double.toString(pedido4.calcularTotal());
        int index4 = totalPedido4.indexOf(".");
        totalPedido4 = totalPedido4.substring(0, index3 + 3);
        System.out.println("Total Pedido: " + totalPedido4.replace('.', ','));
    }
}
