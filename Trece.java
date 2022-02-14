//Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Trece {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter Fecha = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

        System.out.println("¡Bienvenidx!. Este algoritmo le permitirá ingresar 2 palabras y se le devolverá la diferencia entre ambas.");
        System.out.println("");

        System.out.println("La fecha y hora actual es: ");
        System.out.println(Fecha.format(LocalDateTime.now()));

        System.out.println("");
    }
}