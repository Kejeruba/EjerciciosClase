package Tema9.Actividad5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("C:\\Users\\kevin\\Documents\\IntelliJ\\EjerciciosClase\\src\\Tema9\\Actividad4\\Main.java");

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