package listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EjemploHashMap2 {

    public static void main(String[] args) {

        HashMap<String, List<Integer>> notas = new HashMap<>();
        notas.put("Javier", List.of(7,5,7));
        notas.put("David", List.of(6,7,6));
        System.out.println(notas);

    }

}
