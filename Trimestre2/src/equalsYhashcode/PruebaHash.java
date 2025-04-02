package equalsYhashcode;

import java.util.HashSet;

public class PruebaHash {

    public static void main(String[] args) {

        HashSet<Alumno> alumnos = new HashSet<>();
        alumnos.add(new Alumno(1,"Jose Luis", "Rodriguez", "6545646"));
        System.out.println(alumnos);
        alumnos.add(new Alumno(2,"Jose Antonio", "Rodriguez", "6545646"));
        System.out.println(alumnos);

    }

}
