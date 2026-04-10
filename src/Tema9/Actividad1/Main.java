package Tema9.Actividad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            leerEntero();
        } catch (InputMismatchException e) {
            System.out.println("Número incorrecto");
        }
    }

    static void leerEntero() {
        System.out.println("Dime un numero");
        int fallo = sc.nextInt();
    }
}
