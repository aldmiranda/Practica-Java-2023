
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ingrese el nombre de su última mascota: ");
        String nombreMascota = scanner.nextLine();

        System.out.print("Ingrese el nombre de su última película ");
        String nombrePelicula = scanner.nextLine();

        scanner.close();

      
        System.out.println(String.format("Nombre de la próxima bebida:  %s %s", nombreMascota, nombrePelicula));
    }

}



