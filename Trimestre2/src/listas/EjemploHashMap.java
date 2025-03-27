package listas;

import java.util.ArrayList;
import java.util.HashMap;

public class EjemploHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> alumnosNotasProgramacion = new HashMap<>();
        alumnosNotasProgramacion.put("123456A", 8);
        alumnosNotasProgramacion.put("968765B", 5);
        System.out.println(alumnosNotasProgramacion);
        alumnosNotasProgramacion.put("968765B", 7);
        System.out.println(alumnosNotasProgramacion);

        System.out.println(alumnosNotasProgramacion.keySet());
        System.out.println(alumnosNotasProgramacion.values());

    }

}
