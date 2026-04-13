package Tema9.Actividad7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        System.out.println("""
                -----Menu-----
                1. Hacer media
                2. Leer
                3. Salir
                """);
        int opt = sc.nextInt();
        switch (opt) {
            case 1 -> hacerMedia();
            case 2 -> leerTexto();
            case 3 -> System.out.println("Adios");
        }
    }

    static void hacerMedia(){
        try {
            FileReader in = new FileReader("C:\\Users\\kevin\\Documents\\IntelliJ\\EjerciciosClase\\src\\Tema9\\Actividad7\\NumerosReales.txt");
            int contador = 0;
            int sumatotal = 0;
            int read = in.read();
            while (read != -1) {
                int num = (char) read;
                System.out.print(num);
                read = in.read();
            }
            System.out.println("La suma total de los numeros es: " + sumatotal + " con una media de: ");
            in.close();

        } catch (FileNotFoundException e){
            System.out.println("No hay archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        System.out.println("El archivo existe");
    }

    static void leerTexto() {
        try {
            FileReader in = new FileReader("C:\\Users\\kevin\\Documents\\IntelliJ\\EjerciciosClase\\src\\Tema9\\Actividad7\\NumerosReales.txt");

            int read = in.read();
            while (read != -1) {
                System.out.print((char) read);
                read = in.read();
            }
            in.close();

        } catch (FileNotFoundException e){
            System.out.println("No hay archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        System.out.println("El archivo existe");
    }
}
