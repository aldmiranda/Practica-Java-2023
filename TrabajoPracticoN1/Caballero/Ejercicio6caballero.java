package TrabajoPracticoN1.Caballero;

/*Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares. */

import java.util.Scanner;
import java.util.Locale;

public class Ejercicio6caballero {
    public static void main(String[] args) {
        double bitcoins, dolares;
        double TASA_FIJA = 50000.0;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor ingrese una cantidad de bitcoins para realizar la conversión a dolares: ");
        bitcoins = scanner.nextDouble();
        
        dolares = bitcoins * TASA_FIJA;

        scanner.close();

        System.out.printf("%.2f bitcoins son equivalentes a %.2f dólares americanos, teniendo una tasa fija de %.2f%n", bitcoins, dolares, TASA_FIJA);
    }
    }   







