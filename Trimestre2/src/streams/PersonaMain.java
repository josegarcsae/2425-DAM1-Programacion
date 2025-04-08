package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonaMain {
    public static void main(String[] args) {

        // Lista de personas
        List<Persona> personas = Arrays.asList(
                new Persona("Ana", 17),
                new Persona("Luis", 25),
                new Persona("María", 19),
                new Persona("Pedro", 15),
                new Persona("Sofía", 30)
        );

        System.out.println(
                personas
                        .stream()
                        .filter(p -> p.getEdad() > 18)
                        .map(p -> p.getNombre().toUpperCase())
                        .sorted()
                        .limit(3)
                        .collect(Collectors.joining(", "))
        );


    }
}
