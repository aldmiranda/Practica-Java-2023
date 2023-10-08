package TrabajoPracticoN1.Maestro;

/*5. Cálculo de la energía cinética:
Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.
Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad.
Muestre el resultado por pantalla.
 */

import java.util.Scanner;

public class Ejercicio5Maestro {
    public static void main(String[] args) {
        double masa, velocidad;
                
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la masa del objeto: ");
        masa = scanner.nextDouble();
        
        System.out.println("Ingrese la velocidad del movimiento: ");
        velocidad = scanner.nextDouble();

        scanner.close();

        double energiaCinetica = (1.0/2) * masa * Math.pow(velocidad, 2);

        System.out.printf("La energía cinética del obejto a partir de su masa = %.2f kg y su velocidad = %.2f m/s, es igual a %.2f%n E", masa, velocidad, energiaCinetica);

    }
       
}
