package TrabajoPracticoN1.Maestro;

/*4. Cálculo de la media aritmética:
Escribir un programa en Java que calcule la media aritmética de un conjunto de
números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
los números y k es el número total de elementos. Utilicen variables y constantes
según corresponda.
Muestre el resultado por pantalla.
 */

import java.util.Scanner;

public class Ejercicio4Maestro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una catidad de números para calcular su média aritmética: ");
        double k = scanner.nextDouble();

        double suma = 0.0;

        for (int i = 1; i <= k; i++) {
            System.out.println("Ingrese el número" + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double mediaAritmetica = suma / k;

        System.out.println("La media artimética es: " + mediaAritmetica);

        scanner.close();

    }
}
