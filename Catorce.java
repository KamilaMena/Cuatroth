// Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.

import java.util.Scanner;

public class Catorce {
    public static void main(String[] args) throws Exception {
        
        try (Scanner Lector = new Scanner(System.in)) {

            System.out.println("¡Bienvenidx!. Este algoritmo le permitirá ingresar 1 número y se mostrará una secuencia que irá de 2 en 2 hasta 1000.");
            System.out.println("");

            System.out.println("Digite el número del que quiere partir :");
            int Num_Ing = Lector.nextInt();

            while(Num_Ing < 1000){
                Num_Ing = Num_Ing +  2;
                System.out.println(Num_Ing);
            }
            System.out.println("");
        }
    }
}
