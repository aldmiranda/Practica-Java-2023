package Maestro;

/*3. Cálculo de la hipotenusa de un triángulo:
Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos.
 */

import java.util.Scanner;

public class Ejercicio3Maestro {
    public static void main(String[] args) {
        double catetoA, catetoB;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del cateto A: ");
        catetoA = scanner.nextDouble();

        System.out.println("Ingrese el valor del cateto B: ");
        catetoB = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        scanner.close();

        System.out.printf("Dados los catetos A = %.2f y el cateto B = %.2f, el resultado de la hipotenusa es: %.2f", catetoA, catetoB, hipotenusa);

    }
}




