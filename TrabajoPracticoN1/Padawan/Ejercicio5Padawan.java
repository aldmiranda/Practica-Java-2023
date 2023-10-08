// Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
// otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
// una constante de los valores que no van a cambiar en esta conversión. Muestre el
// resultado por pantalla

package TrabajoPracticoN1.Padawan;

import java.util.Scanner;

public class Ejercicio5Padawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu peso en libras y realizaremos la conversión a kilogramos: ");
        double libras = scanner.nextDouble();

        final double CONVERSION = 0.453592;
        double kilogramos = libras * CONVERSION;

        System.out.printf("Tu peso en libras equivale a %.2f kilogramos%n", kilogramos);
        
        scanner.close();
    }
}        

