package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prueba1 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filtrados = new ArrayList<>();
        for (int numero : numeros) {
            if (numero > 4) {
                filtrados.add(numero);
            }
        }
        System.out.println(filtrados);

        System.out.println(numeros
                .stream()
                .filter(numero -> numero > 4)
                .map(numero -> numero * 2)
                .min((o1, o2) -> o1.compareTo(o2)).orElse(1));

        List<String> nombres = Arrays.asList("Ana", "María", "Luis");
        List<String> nombresEnMayusculas = nombres
                .stream()
                .map(n -> n.toUpperCase() + " ")
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nombresEnMayusculas);
        System.out.println(nombresEnMayusculas
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .count());


    }

}
