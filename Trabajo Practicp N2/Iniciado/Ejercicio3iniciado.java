/* Suma de números : Realizar un programa que guarde un número en memoria y
determine si par o impar. */

import java.util.Scanner;

public class Ejercicio3iniciado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Determinar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
        scanner.close();
    }
   }

   
