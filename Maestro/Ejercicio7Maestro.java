package Maestro;

/* Cálculo de la fuerza centrípeta:
Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
de la trayectoria.
Muestre el resultado por pantalla. */

import java.util.Scanner;

public class Ejercicio7Maestro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la masa del objeto: ");
        double m = scanner.nextDouble();

        System.out.println("Ingrese la velocidad angular: ");
        double vA = Math.pow(scanner.nextDouble(), 2);

        System.out.println("Ingrese el radio: ");
        double r = scanner.nextDouble();

        scanner.close();

        double fuerzaCentripeda = m * vA / r;

        System.out.printf("La fuerza centrípeda es igual a %.2f\n\nTeniendo en cuenta los siguientes datos:\nMasa = %.2f\nVelocidad Angular = %.2f\nRadio = %.2f", fuerzaCentripeda, m, vA, r);
        
    }
}
