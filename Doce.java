// Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.

import java.util.Scanner;

public class Doce {
    public static void main(String[] args) throws Exception {
        try (Scanner Lector = new Scanner(System.in)) {

            System.out.println("¡Bienvenidx!. Este algoritmo le permitirá ingresar 2 palabras y se le devolverá la diferencia entre ambas.");
            System.out.println("");

            System.out.println("Escriba la primera palabra: ");
            String Palabra1 = Lector.nextLine();

            System.out.println("Escriba la segunda palabra: ");
            String Palabra2 = Lector.nextLine();
            
            System.out.println("");
            
            if (Palabra1.equals(Palabra2))
            {
              System.out.println("Las 2 palabras son iguales.");
            }else{
                System.out.println("Las palabras son diferentes.");
                int i = 0;
                while (i < 4){
                    if(Palabra1.charAt(i) !=  Palabra2.charAt(i)){
                        System.out.println("La palabra uno tiene: " + Palabra1.charAt(i));
                        System.out.println("La palabra dos tiene: " + Palabra2.charAt(i));
                    }
                    i++;
                    System.out.println("");
                }      
            }
        }
    }
}