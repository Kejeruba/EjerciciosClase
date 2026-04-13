package Tema9.Actividad8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try(BufferedWriter out = new BufferedWriter(new FileWriter("src/Tema9/Actividad8/salida.txt"))){

            String cad = "En un lugar de La Mancha,";

            for(int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
                System.out.println(cad.charAt(i));
            }

            cad = "De cuyo nombre no quiero acdormarme.";
            System.out.println(cad);

            out.newLine();

            out.write(cad);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}