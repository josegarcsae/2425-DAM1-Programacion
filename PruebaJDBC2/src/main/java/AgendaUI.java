import java.util.List;
import java.util.Scanner;

public class AgendaUI {

    public static Contacto pedirNuevoContacto(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Apellidos: ");
        String apellidos = sc.next();
        System.out.print("Apodo: ");
        String apodo = sc.next();
        Contacto nuevo = new Contacto(null, nombre, apellidos);
        nuevo.setApodo(apodo);
        return nuevo;
    }

    public static void imprimirContactos(List<Contacto> contactos) {
        for (Contacto c : contactos)
            System.out.println(c);
    }
}
