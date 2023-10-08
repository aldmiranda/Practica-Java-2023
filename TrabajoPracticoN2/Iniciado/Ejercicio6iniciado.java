import java.util.Scanner;

/*A mi me gustan los pares: Escribe un programa que imprima solo los N números
pares, donde los N números son guardados en variables o constantes según
corresponda.
 */

public class Ejercicio6iniciado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");        
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("El numero ingresaro debe ser mayor a cero.");
        } else {
            System.out.println("Los primeros " + N + " numeros pares son: ");
        
            int numero = 2;
            int contador = 0;

            while (contador < N) {
                System.out.println(numero);
                numero +=2;
                contador++;
            }

            scanner.close();

        }

    }
        
}

