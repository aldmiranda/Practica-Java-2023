/*Espero aprobar : Escribe un programa que imprima un título para el programa,
luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
donde los N números son guardados en variables o constantes según corresponda.
Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con
cuanto */

/* definir en N la cantidad de notas,
 * pedir que ingrese la cantidad de nota a evaluar
 * calcularel promerio de las notas
 * mostrar el promedio
 * verficar si aprobo ono
 */

import java.util.Scanner;

public class Ejercicio7iniciado {
    public static void main(String[] args) {
        System.out.println("Cálculo del Promedio y Aprobación\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de notas: ");        
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("La cantidad de notas debe ser mayor a cero");
        } else {
            System.out.println("El promedio de  " + N + " notas es igual a: ");
            
            double[] notas = new double[N];
            
            System.out.println("Ingrese las " + N + " notas separadas por espacios \n");

            for (int i = 0; i < N; i++) {
                notas[i] = scanner.nextDouble();
            }

            double suma = 0;

            for (int i = 0; i < N; i++) {
                suma += notas[i];
            }

            double promedio = suma / N;

            System.out.println("El promedio de las notas es " + promedio + "\n");
            
            if (promedio < 6) {
                System.out.println("No aprobaste!,continua estudiando.");
            } else { 
                System.out.println("Felcitaciones aprobaste la mataria!");

            }
        
            scanner.close();
        
        }
        
    }
}

