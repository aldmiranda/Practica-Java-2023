package Caballero;

// Conversión de dólares a pesos: Escribir un programa en Java que solicite al
// usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
// tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
// usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.

import java.util.Scanner;

public class Ejercicio2caballero {
    public static void main(String[] args) {
        int dolares;
        int TASA_FIJA;
        double dolarConversion;

        TASA_FIJA = 885;
                    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un importes en dolares: ");
        dolares = scanner.nextInt();

        dolarConversion = (double) dolares * TASA_FIJA;

        scanner.close();
        System.out.printf("%d dolares equivalen a %.2f pesos, teniendo en cuenta un valor de %d%n Blue", dolares, dolarConversion, TASA_FIJA);
     
    }
}

