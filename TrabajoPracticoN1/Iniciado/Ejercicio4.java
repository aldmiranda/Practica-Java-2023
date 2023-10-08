package TrabajoPracticoN1.Iniciado;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = 10;
        numero2 = 5;

        var resultado = numero1 + numero2;

        System.out.println(String.format("El %d %s es divisble por el %d y el resutlado es %d", numero1, numero1%numero2 == 0? "" : "no", numero2, resultado));
    }
}



