// Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.

import java.util.Scanner;

public class Ocho {
    public static void main(String[] args) throws Exception {
        try (Scanner Lector = new Scanner(System.in)) {
            System.out.println("¡Bienvenidx!. Este algoritmo le permitirá ingresar un día de la semana y le dirá si es laboral o no.");
            System.out.println("");
            System.out.println("Ingrese el día de la semana: ");
            String Dia_Ing = Lector.nextLine();

            switch(Dia_Ing){
                case "Lunes":
                System.out.println("El " + Dia_Ing + " es un día LABORAL");
                break;

                case "Martes":
                System.out.println("El " + Dia_Ing + " es un día LABORAL");
                break;

                case "Miercoles":
                System.out.println("El " + Dia_Ing + " es un día LABORAL");
                break;

                case "Jueves":
                System.out.println("El " + Dia_Ing + " es un día LABORAL");
                break;

                case "Viernes":
                System.out.println("El " + Dia_Ing + " es un día LABORAL");
                break;

                case "Sabado":
                System.out.println("El " + Dia_Ing + " es un día LABORAL");
                break;

                case "Domingo":
                System.out.println("El " + Dia_Ing + " NO es un día LABORAL");
                break;

                default:
                System.out.println("El día ingresado " + Dia_Ing + " no es válido.");

                System.out.println("");
            }
        }
    }
}