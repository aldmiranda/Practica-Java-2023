package Iniciado;
public class Ejercicio2 {
    public static void main(String[] args){
        int numero1, numero2;
        numero1 = 10;
        numero2 = 5;
        int resultado = numero1 + numero2;
        System.out.println("la suma es " + (numero1 + numero2) + " el resultado es un número " + (resultado%2 == 0? "par" : "impar"));
    }
}
