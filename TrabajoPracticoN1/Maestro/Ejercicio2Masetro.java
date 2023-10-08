package TrabajoPracticoN1.Maestro;

/*Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve. */

// Fórmula (0 ºC * 9/5) + 32 = 32ºF

import java.util.Scanner;

public class Ejercicio2Masetro {
    public static void main(String[] args) {
        double gCelsius, gFahrenhit;
            
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese una temperatura en ºC: ");
        gCelsius = scanner.nextDouble();

        gFahrenhit = (gCelsius * 9/5) + 32;

        scanner.close();

        System.out.printf("%.2f ºC son equivalentes a %.2f ºF%n", gCelsius, gFahrenhit);
        
    }
}
