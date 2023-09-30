package EjerciciosEnClase;

import java.util.Scanner;

public class NumeroPrimoFede {
    public static void main(String[] args) {
        int max, count, min, i, j;
        count = 0;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese un mínimo en el rango de 1 a 999");
        min = scanner.nextInt();
        System.out.println("Ingrese un máximo en el rango de 1 a 1000");
        max = scanner.nextInt();
    
        while (min < 0 || max > 1000 || max < min) {
            System.out.println("El rango elegido se encuentra fuera de los parámetros permitidos");
            System.out.println("Ingrese nuevamente un mínimo");
            min = scanner.nextInt();
            System.out.println("Ingrese un máximo");
            max = scanner.nextInt();
            
        }

        for (i = min; i <= max; i++) {
            if (i==2) {
                System.out.println(i + " es un número primo");
                count++;
                continue;
            }

            for (j = 2; j <= Math.ceil(Math.pow(i, 0.5)); j++){
                if (i % j == 0){
                break;
            }   else if (j == Math.ceil(Math.pow(i, 0.5))) {
                System.out.println(i + " es un número primo");
                count++;
                } 
            }
        }
        
        System.out.println("Hay "+ count + " número primos del " + min + " al " + max);
    }
}
