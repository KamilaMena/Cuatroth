// Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) throws Exception {
        try (Scanner Numeros = new Scanner(System.in)) {
            System.out.println("¡Bienvenidx!. En este algoritmo veremos cual de los número que ingresará es mayor");

            System.out.println("Ingrese el primer número: ");
            int N1 = Numeros.nextInt();

            System.out.println("");

            System.out.println("Ingrese el segundo número: 74");
            int N2 = Numeros.nextInt();

            System.out.println("");

            if(N1 > N2) {
                System.out.println("El primer número (" + N1 + ") es mayor que el segundo (" + N2 + ")");
                } else if(N2 > N1) 
                    {
                        System.out.println("El segundo número (" + N2 + ") es mayor que el primero (" + N1 + ")");

                    } else if (N1 == N2) 
                        {
                         System.out.println("El primer número (" + N1 + ") y el segundo (" + N2 + ") son iguales.");
                        }
            
            System.out.println("");
        }
    }
}