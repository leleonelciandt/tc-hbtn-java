public class Quadrado {

    public static double area(double lado) {
        double area = lado * lado;
        if (lado < 0) {
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        } else {
            return area;
        }
    }
}
