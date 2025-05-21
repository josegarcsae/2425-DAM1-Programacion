package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fichero1 {

    public static void main(String[] args) {

        // Abrimos el Scanner en el try para que se cierre automáticamente
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce un nombre de fichero");
            String name = sc.next();
            File f = new File(name);
            if (!f.exists()) {
                System.out.println("Creamos el fichero " + name);
                f.createNewFile();
            } else {
                System.out.println("Tiene un tamaño :: " + f.length());
            }
        } catch (IOException e) {
            System.err.println("Error!");
            throw new RuntimeException(e);
        }

    }

}
