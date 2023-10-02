package Caballero;

// Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
// porcentaje que indique el segundo número del primer número.

import java.util.Scanner;

public class Ejercicio1caballero {
    public static void main(String[] args) {
        double real;         
        int entero;

        Scanner scanner= new Scanner(System.in);

        System.out.print("Ingrese un número real por favor: ");
        real = scanner.nextDouble();
        System.out.print("Ingrese un número entero por favor: ");
        entero = scanner.nextInt();

        double resultado = ((double) entero / real) * 100;

        scanner.close();

        System.out.printf("%d es el porcentaje del entero %d, respecto del real %.2f%n", (int) resultado, entero, real);
        
    }
}


