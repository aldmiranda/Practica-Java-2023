/*2. Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo */

import java.util.Scanner;

public class Ejercicio2iniciado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidadAmigos = scanner.nextInt();

        String[] nombresAmigos = new String[cantidadAmigos];

        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.print("Ingrese el nombre del amigo " + (i + 1) + ": ");
            nombresAmigos[i] = scanner.next();
        }

        System.out.println("Nombres de tus amigos:");
        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.println(nombresAmigos[i]);
        }

        scanner.close();
    }
}
