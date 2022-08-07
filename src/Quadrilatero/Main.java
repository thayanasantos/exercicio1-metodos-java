package Quadrilatero;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio Quadrilatero");

        double areaQuadrado = Quadrilatero.area(4);
        System.out.println("Area do Quadrado: " + areaQuadrado);

        double areaRentangulo = Quadrilatero.area(2,3);
        System.out.println("Area do Retangulo: " + areaRentangulo);

        double areaQuadrilatero = Quadrilatero.area(2,3,4);
        System.out.println("Area do Quadrilatero: " + areaQuadrilatero);
    }
}
