public class NumerosPares {
    public static void main(String[] args) {
        int numPar = 0;
        for (numPar = 0; numPar < 98; numPar++)
            if (numPar % 2 == 0){
                System.out.print(numPar + ", ");
            }
        System.out.println(numPar);
    }
}
