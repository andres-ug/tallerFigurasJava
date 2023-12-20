package taller.figuras;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SUAREZ GUZMAN ANDRES");

        System.out.print("Radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        
        Circulo circulo = new Circulo(radioCirculo);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.print("Longitud del rectángulo: ");
        double lonRectangulo = scanner.nextDouble();

        System.out.print("Ancho del rectángulo: ");
        double anchoRectangulo = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lonRectangulo, anchoRectangulo);
        System.out.println("Área rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro rectángulo: " + rectangulo.calcularPerimetro());

        scanner.close();
    }
}
