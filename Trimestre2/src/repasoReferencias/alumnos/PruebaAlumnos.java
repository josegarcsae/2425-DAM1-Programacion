package repasoReferencias.alumnos;

public class PruebaAlumnos {

    public static void main(String[] args) {

        Alumno nuevo = new Alumno("Matias", "Garcia", 37);
        System.out.println(nuevo);

        Profesor profe = new Profesor("Marta", "Rodriguez", "Programación");
        System.out.println(profe);

        nuevo.profeAsignatura1 = profe;
        System.out.println(nuevo);
        profe.addAlumno(nuevo);
        System.out.println(profe);

    }

}
