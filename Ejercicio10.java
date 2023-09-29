public class Ejercicio10 {
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = 2;
        numero2 = 3;

        double acumulacion = 0.0;

        for (int i = 1; i <= 15; i++) {
            double resultado = (double) (numero1*numero2)/i;
        
        acumulacion += resultado;
        }

        System.out.println(String.format("La acumulación de quince multiplicaciones entre el %d y el %d divididos por el numero de la multiplicacion es: ", numero1, numero2) + acumulacion);
    }

}

// 10. Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
// de quince multiplicaciones entre dos números enteros divididos por el número de la
// multiplicación. Por ejemplo:
// Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
// El resultado mostrarlo por pantalla