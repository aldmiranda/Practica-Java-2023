import java.util.Scanner;

/*1. Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. Usar bucles */

public class Ejercicio1iniciado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura del triángulo: ");
        int altura = scanner.nextInt();
        scanner.close();

        if (altura < 1){
            System.out.println("por favor ingresar una altura mínima de 1");
        } else {
            for (int i = 1; i <= altura; i++) {
            int espacios = altura - i;
            
                for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                }
            
            System.out.println();
        }
     }
   }
 }

