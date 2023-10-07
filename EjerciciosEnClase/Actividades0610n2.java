package EjerciciosEnClase;

public class Actividades0610n2 {
    public static void main(String[] args) {
        int[][] myArray2D = {{1,2,3}, {4,5,6},{7,8,9}};

        int sumaDiagonal = 0;
        
        for (int i = 0; i < myArray2D.length; i++) {
            sumaDiagonal += myArray2D [i][i];

        }

        System.out.printf("La suma de los elementos en la diagonal es igual a: %d%n", sumaDiagonal);
    }
}
