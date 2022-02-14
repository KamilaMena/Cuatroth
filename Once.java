// Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.

import java.util.Scanner;

public class Once {
    public static void main(String[] args) throws Exception {
        try (Scanner Lector = new Scanner(System.in)) {

            System.out.println("¡Bienvenidx!. Este algoritmo le permitirá ingresar una frase y se le devolverá la cantidad de cada vocal que contenga y su longitud.");
            System.out.println("");

            System.out.println("Digite la frase: ");
            String Frase_Ing = Lector.nextLine();
  
            int i = 0;
            int Cont_A =0 ;
            int Cont_E = 0 ;
            int Cont_I = 0;
            int Cont_O = 0;
            int Cont_U = 0;
  
            while(i < Frase_Ing.length()) {
                if(Frase_Ing.charAt(i) == 'a'){
                    Cont_A = Cont_A + 1 ;
                }
                if(Frase_Ing.charAt(i) == 'e'){
                    Cont_E = Cont_E + 1 ;
                }
  
                if(Frase_Ing.charAt(i) == 'i'){
                    Cont_I = Cont_I + 1 ;
                }
  
                if(Frase_Ing.charAt(i) == 'o'){
                    Cont_O = Cont_O + 1 ;
                }
  
                if(Frase_Ing.charAt(i) == 'u'){
                    Cont_U = Cont_U + 1 ;
                }
               i++; 
              }
              
            System.out.println("");
            System.out.println("La frase : " + Frase_Ing + ", con " + Frase_Ing.length() + " cantidad de letras, contiene: ");
            System.out.println("");
            System.out.println(Cont_A + " vocales A.");
            System.out.println(Cont_E + " vocales E.");
            System.out.println(Cont_I + " vocales I.");
            System.out.println(Cont_O + " vocales O.");
            System.out.println(Cont_U + " vocales U.");
            System.out.println("");
        }
    }
}