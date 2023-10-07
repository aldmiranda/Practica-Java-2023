package Caballero;

/* 5. Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
ingresa 5000 pesos, el programa deberá mostrar 250 euros.
 */
import java.util.Scanner;

public class Ejercicio5caballero {
    public static void main(String[] args) {
        double pesos, euros;
        double TASA_FIJA = 20;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Por favor ingrese un monto en pesos: ");         
    pesos = scanner.nextDouble();

    euros = pesos / TASA_FIJA;

    scanner.close();

    System.out.printf("El importe de %.2f pesos es equivalente a %.2f euros. Teniendo una tasa de converión igual a %.2f%n", pesos, euros, TASA_FIJA);

    }
}

