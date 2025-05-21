package ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binario1 {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("guzman.bin", false)) {
            fos.write("hola Ivan".getBytes());
        } catch (IOException e) {
            System.err.println("Error al guardar");
        }

        try (FileInputStream fis = new FileInputStream("guzman.bin")) {
            int b;
            while ((b = fis.read()) != -1)
                System.out.print((char) b);
        } catch (IOException e) {
            System.err.println("Error al leer");
        }

    }

}
