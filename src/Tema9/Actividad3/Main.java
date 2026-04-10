package Tema9.Actividad3;

public class Main {
    public static void main(String[] args) {
        metodo2();
    }

    static void metodo2(){
        try {
            metodo1();
        } catch (NumberFormatException e) {
            System.out.println("Error captado: " + e.getMessage());
        }
    }

    static void metodo1() throws NumberFormatException{
        int numero = Integer.parseInt("casa");
    }


}
