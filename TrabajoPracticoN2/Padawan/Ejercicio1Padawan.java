package TrabajoPracticoN2.Padawan;

/*Convierto lo que me da la gana: Demuestre cómo convertir un bucle WHILE en un
DO WHILE.
 */

import java.util.Scanner;

public class Ejercicio1Padawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroIngresado;

        System.out.println("Ingrese números (0.9 o más para salir):");

        do {
            numeroIngresado = scanner.nextDouble();
            System.out.println("Número ingresado: " + numeroIngresado);
        } while (numeroIngresado < 0.9);

        System.out.println("Ha ingresado un número mayor o igual a 0.9.");
        scanner.close();
    }
}


