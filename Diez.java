// Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.

import java.util.Scanner;

public class Diez {
    public static void main(String[] args) throws Exception {
        try (Scanner Lector = new Scanner(System.in)) {
           
            int i = 0;

            System.out.println("¡Bienvenidx!. Este algoritmo le permitirá ingresar una frase y se le devolverá sin espacios.");
            System.out.println("");

            
            System.out.println("Ingrese la frase: ");
            String Frase_Ing = Lector.nextLine();

            while(i < Frase_Ing.length()) {
                if(Frase_Ing.charAt(i) == ' ') {
                    Frase_Ing = Frase_Ing.substring(0,i) + Frase_Ing.substring(i+1);
                }
                i++;
            }
            System.out.println("");
            System.out.println("La frase ingresa sin espacios es: " + Frase_Ing);
        }
    }
}