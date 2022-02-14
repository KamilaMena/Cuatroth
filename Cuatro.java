// Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%

import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args) throws Exception {
        try (Scanner Lector = new Scanner(System.in)) {
            float Producto;
            float iva;
            System.out.println("¡Bienvenidx!. En este algoritmo calcularemos el precio final de un producto al aumentarle el porcentaje del IVA (21%)");
            System.out.println("");
            System.out.println("Digite el valor del producto: ");
            Producto = Lector.nextFloat();

            iva = (float) (Producto * 21) / 100;

            System.out.println("");

            System.out.println("Su producto tiene un valor de $" + Producto);
            System.out.println("El precio de IVA que le corresponde es $" + iva);
            System.out.println("");
            System.out.println("Esto le da un total de: $" + (Producto+iva));
            System.out.println("");
        }
    }
}