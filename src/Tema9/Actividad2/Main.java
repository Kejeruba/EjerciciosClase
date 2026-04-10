package Tema9.Actividad2;

public class Main {
    public static void main(String[] args) {
        int num = 0;

        System.out.println(num);
        try {
            int numero = Integer.parseInt("abc");
            int resultado = 100 / num;

        } catch (ArithmeticException | NumberFormatException f) {
            System.out.println("Se ha producido un error");
        }
    }
}
