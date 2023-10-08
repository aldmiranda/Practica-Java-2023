package TrabajoPracticoN1.Iniciado;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        scanner.close();

        System.out.println(String.format("Mi nombre es: %s", nombre));
        System.out.println(String.format("Mi edad es %d", edad ));
        
        // El mensaje debe tener el siguiente formato:
        // “Mi nombre es “ {Nombre}
        // “Mi edad es” {Edad}

    }
}


