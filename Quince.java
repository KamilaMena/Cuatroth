//          Hacer un programa que muestre el siguiente menú de opciones
//          ****** GESTION CINEMATOGRÁFICA ********
//          1-NUEVO ACTOR
//          2-BUSCAR ACTOR
//          3-ELIMINAR ACTOR
//          4-MODIFICAR ACTOR
//          5-VER TODOS LOS ACTORES
//          6- VER PELICULAS DE LOS ACTORES
//          7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
//          8-SALIR
// EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE. PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.

import java.util.Scanner;

public class Quince {
    public static void main(String[] args) throws Exception {
        try (Scanner Lector = new Scanner(System.in)) {
            int Opcion;
            do{
                System.out.println("                 ****** GESTION CINEMATOGRÁFICA ********");
                System.out.println("                         SELECCIONE UNA OPCION         ");
                System.out.println("            1: NUEVO ACTOR ");
                System.out.println("            2: BUSCAR ACTOR");
                System.out.println("            3: ELIMINAR ACTOR");
                System.out.println("            4: MODIFICAR ACTOR");
                System.out.println("            5: VER TODOS LOS ACTORES");
                System.out.println("            6: VER PELICULAS DE LOS ACTORES");
                System.out.println("            7: VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                System.out.println("            8: SALIR ");

                System.out.println("");
                System.out.println("Ingrese su elección: ");
                Opcion = Lector.nextInt();

                if (Opcion != 1 && Opcion != 2 && Opcion != 3 && Opcion != 4 && Opcion != 5 && Opcion != 6 && Opcion != 7 && Opcion != 8){
                    System.out.println("");
                    System.out.println("Opción incorrecta");
                    System.out.println("");
                    break;
                }

            }while(Opcion != 8);

            if (Opcion == 8){
                System.out.println("");
                System.out.println("¡Ha seleccionado la opción de salida!");
                System.out.println("Gracias por usar nuestro menú.");
                System.out.println("");
            }
        }
    }
}