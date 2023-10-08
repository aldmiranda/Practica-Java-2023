package TrabajoPracticoN2.Padawan;

/*El factorial : Realizar un programa que calcule el factorial de un número
 */

import java.util.Scanner;

public class Ejercicio3Padawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero, el cual no puede ser negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número no puede ser negativo.");
        } else {
            long factorial = 1;

            // Calcular el factorial del número
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}


