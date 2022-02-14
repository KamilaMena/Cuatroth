// Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.

public class Cinco {
    public static void main(String[] args) throws Exception {
        int N = 1;
        while ( N <= 100) {
            if (N % 2 == 0) {
                System.out.println("Par:      " + N);
            }
            else{
                System.out.println("Impar:    " + N);
            }
            N++;
        }
    }
}