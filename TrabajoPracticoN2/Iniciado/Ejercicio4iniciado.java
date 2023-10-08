/*De que se trata esto? : Realizar un programa que guarde un número en memoria y
determine si es positivo, negativo o cero.
 */

import java.util.Scanner;

public class Ejercicio4iniciado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número por favor: ");
        double numero = scanner.nextDouble();

        if (numero == 0) {
            System.out.println(numero + " Es un cero ;-)");            
        } else if (numero < 0) {
            System.out.println(numero + " Es un número negativo");
        } else if (numero > 0) {
            System.out.println(numero + " Es un número positivo");
        }

        scanner.close();
    }
}
