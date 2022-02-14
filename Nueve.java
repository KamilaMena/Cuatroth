// Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.

import java.util.Scanner;

public class Nueve {
    public static void main(String[] args) throws Exception {
        try (Scanner Lector = new Scanner(System.in)) {
            String Frase = "La sonrisa sera la mejor arma contra la tristeza";

            String Frase_E = Frase.replace("a","e");

            System.out.println("La frase guardada es: " + Frase);
            System.out.println("");
            System.out.println("Ingrese una frase/palabra que quiera añadirle: ");
            String Frase_Ing = Lector.nextLine();
            System.out.println("");

            System.out.println("El resultado es: " + Frase_E +" "+ Frase_Ing);

            
            System.out.println("");
        } 
    }
}