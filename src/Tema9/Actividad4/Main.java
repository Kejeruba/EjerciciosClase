package Tema9.Actividad4;

public class Main {
    public static void main(String[] args) {
        metodo2();
    }

    static void metodo2(){
        try {
            metodo1();
        } catch (ArithmeticException e) {
            System.out.println("Error captado: " + e.getMessage());
        }
    }

    static void metodo1() throws ArithmeticException{
        try {
            int numero = 10/0;
        } finally {
            System.out.println("Cualquier cosa");
        }
    }
}
