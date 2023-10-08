package TrabajoPracticoN1.Maestro;

/*1. Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
resuelve.
 */

/* Área de un cículo = pi * r2 */

import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1Maestro {
    public static void main(String[] args) {
        final double PI = 3.141592;
        double area;
        double radio;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Ingrese las unidades del radio: ");
        radio = scanner.nextDouble();

        area = PI * Math.pow(radio, 2);
        

        scanner.close();

        System.out.printf("El área de un círculo, cuyo radio es %.2f es igual a %.2f%n", radio, area);
             
    }
}

