package Tema9.Actividad6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kevin\\Documents\\IntelliJ\\EjerciciosClase\\src\\Tema9\\Actividad4\\Main.java"));

            int read = br.read();
            while (read != -1) {
                System.out.print((char) read);
                read = br.read();
            }
            br.close();

        } catch (FileNotFoundException e){
            System.out.println("No hay archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        System.out.println("El archivo existe");

    }
}
