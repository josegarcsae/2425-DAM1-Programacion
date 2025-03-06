package listas;

import java.util.ArrayList;
import java.util.HashMap;

public class EjemploHashMapArrays {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> alumnosNotas = new HashMap<>();

        insertarNotaAlumno(alumnosNotas, "Aitor", 5);
        insertarNotaAlumno(alumnosNotas, "Aitor", 9);
        insertarNotaAlumno(alumnosNotas, "Javier", 8);
        System.out.println(alumnosNotas);
    }

    private static void insertarNotaAlumno(HashMap<String, ArrayList<Integer>> alumnosNotas,
        String alumno, Integer nota) {
        if (!alumnosNotas.containsKey(alumno))
            alumnosNotas.put(alumno, new ArrayList<>());
        alumnosNotas.get(alumno).add(nota);
    }
}
