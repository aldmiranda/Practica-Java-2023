package TrabajoPracticoN1.Caballero;

// 3. Conversión de euros a dólares: Escribir un programa en Java que solicite al
// usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
// tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
// el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares

import java.util.Scanner;

public class Ejercicio3caballero {
    public static void main(String[] args) {
       double dolares;
       double euros;
       double TASA_CAMBIO = 1.20;

       Scanner scanner = new Scanner (System.in);
       System.out.println("Ingres un monto en euros por favor: ");
       euros = scanner.nextDouble();

       dolares = (double) euros * TASA_CAMBIO;

       scanner.close();

       System.out.printf("%.2f euros son equivalentes a %.2f dólares, teniendo una tasa de cambio fija de %.2f%n", euros, dolares, TASA_CAMBIO);

    }
}
