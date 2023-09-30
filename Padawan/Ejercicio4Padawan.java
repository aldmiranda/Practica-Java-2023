package Padawan;

public class Ejercicio4Padawan {
    public static void main(String[] args) {
        int edad1, edad2, edad3, edad4;
        edad1 = 0;
        edad2 = 3;
        edad3 = 11;
        edad4 = 35;
        
        String nombre1, nombre2, nombre3, nombre4;
        nombre1 = "Lucia";
        nombre2 = "Agustin";
        nombre3 = "Bastian";
        nombre4 = "Fede";

        System.out.println(String.format("La edad de %s es: %d", nombre1, edad1));
        System.out.println(String.format("La edad de %s es: %d", nombre2, edad2));
        System.out.println(String.format("La edad de %s es: %d", nombre3, edad3));
        System.out.println(String.format("La edad de %s es: %d", nombre4, edad4));

        System.out.println("El promedio de edad es: "+ (edad1+edad2+edad3+edad4)/4);
    }

}


