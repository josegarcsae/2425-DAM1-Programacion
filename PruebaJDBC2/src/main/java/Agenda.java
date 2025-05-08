import java.util.List;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int num = -1;
            while (num != 0) {
                System.out.println("""
                        Introduce la opción que desees:
                        1) Mostrar toda la agenda
                        2) Buscar en la agenda por nombre
                        3) Insertar un nuevo elemento en la agenda
                        4) Actualizar un elemento en la agenda
                        5) Eliminar un elemento de la agenda
                        0) Salir
                        """);
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        AgendaUI.imprimirContactos(AgendaBD.cargaTodaLaAgenda());
                        break;
                    case 2:
                        System.out.println("Introduce el nombre para buscar");
                        String nombre = sc.next();
                        List<Contacto> contactos = AgendaBD.buscarPorNombre(nombre);
                        AgendaUI.imprimirContactos(contactos);
                        break;
                    case 3:
                        Contacto contacto = AgendaUI.pedirNuevoContacto(sc);
                        AgendaBD.insertarUnNuevoContacto(contacto);
                }
            }
            System.out.println("Adios");
        }

    }

}
