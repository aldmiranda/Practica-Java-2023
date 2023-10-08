package TrabajoPracticoN1.Caballero;

/*. Conversión de libras esterlinas a dólares: Escribir un programa en Java que
solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
deberá mostrar 70 dólares.

 */

import java.util.Scanner;

public class Ejercicio4caballero {
    public static void main(String[] args) {
        double libras, dolares;
        double TASA_FIJA = 1.40;
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un importe en libras Esterlinas: ");
        libras = scanner.nextDouble();

        dolares = libras * TASA_FIJA;

        System.out.printf("El importe de %.2f libras Esterlinas, equivale a %.2f dolares. Teniendo una tasa fija de %f", libras, dolares, TASA_FIJA);
        
        scanner.close();

    }
}

