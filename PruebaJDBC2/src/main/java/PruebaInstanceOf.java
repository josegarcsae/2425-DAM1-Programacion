import PersonaSerielizable.Alumno;
import PersonaSerielizable.Delegado;
import PersonaSerielizable.Evaluable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PruebaInstanceOf {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        Delegado aitor = new Delegado();
        List<Alumno> clase = new ArrayList<>();
        List<Alumno> dam1 = Arrays.asList(alumno, aitor);
        System.out.println("alumno instanceof Alumno :: " + (alumno instanceof Alumno));
        System.out.println("alumno instanceof List :: " + (alumno instanceof List));
        System.out.println("clase instanceof List :: " + (clase instanceof List));
        System.out.println("dam1 instanceof List :: " + (dam1 instanceof List));
        System.out.println("dam1 instanceof ArrayList :: " + (dam1 instanceof ArrayList));

        if (alumno instanceof Delegado)
            System.out.println("alumno es el delegado!");
        if (aitor instanceof Delegado)
            System.out.println("aitor es el delegado!");

        for (Alumno a : dam1)
            evalua(a);
    }

    static void evalua(Evaluable e) {
        e.ponerNota();
        if (e instanceof Delegado)
            System.out.println("Hemos puesto nota a Aitor");
    }

}
