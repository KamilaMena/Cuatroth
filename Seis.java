// Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un ciclo for

public class Seis {
    public static void main(String[] args) throws Exception {

        for ( int N = 0; N <= 100; N++) {
            if (N % 2 == 0) {
                System.out.println("Par:      " + N);
            }
            else{
                System.out.println("Impar:    " + N);
            }
        }
    }
}