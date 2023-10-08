package TrabajoPracticoN1.Maestro;

/*  Cálculo de la velocidad final:
Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
transcurrido.
 */

import java.util.Scanner;

public class Ejercicio6Maestro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la velocidad inicial: ");
        double v_i = scanner.nextDouble();

        System.out.println("Ingrese la aceleración de la gravedad: ");
        double g = scanner.nextDouble();

        System.out.println("Ingrese el tiempo: ");
        double t = scanner.nextDouble();

        scanner.close();

        double v_f = v_i + (g * t);

        System.out.printf("La velocidad final del objeto en caida libre es: %.2f\n\nteniendo en cuenta los siguientes datos:\n\nVelocidad Inicial = %.2f\nAceleración de gravedad = %.2f\ntiempo = %.2f%n", v_f, v_i, g, t);
        
    }
}
