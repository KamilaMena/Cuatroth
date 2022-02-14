// Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

import java.util.Scanner;

public class Siete {
    public static void main(String[] args) throws Exception {
        
        try (Scanner Lector = new Scanner(System.in)) {
            int Num_Ing;

            do{
                System.out.println("Ingrese un número mayor a 0: ");
                Num_Ing = Lector.nextInt();
                System.out.println("");
            }while(Num_Ing <= 0);

            System.out.println("¡Correcto! El número ingresado (" + Num_Ing + ") es diferente a 0");
            

            System.out.println("");
        }
	}	
}