package listas;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("hola");
        lista.add("mundo");
        lista.add(2, "adios");
        lista.add(2, 37);
        lista.add("hola");
        System.out.println(lista);

        // Modificar la lista para que esté todo en mayúsculas
        // Usar toUpperCase
    }
}
