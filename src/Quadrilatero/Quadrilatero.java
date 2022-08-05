package Quadrilatero;

public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("Area do quadrado e: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Area do retangulo e: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Area do quadrilatero e: " + ((baseMaior*baseMenor)*altura)/2);
    }
}
