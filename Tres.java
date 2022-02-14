// Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) throws Exception {
        try (Scanner Lector = new Scanner(System.in)) {
            System.out.println("¡Bienvenidx!. En este algoritmo calcularemos el área de un circulo.");
            System.out.println("");
            System.out.println("Digite el radio del círclo: ");
            double Radio = Lector.nextDouble();

            double Area = Math.PI * Math.pow(Radio, 2);

            System.out.println("");

            System.out.println("El área del circulo es " + Area);

            System.out.println("");
        }

    }

}