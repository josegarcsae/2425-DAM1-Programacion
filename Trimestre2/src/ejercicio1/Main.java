package ejercicio1;

public class Main {
    public static void main(String[] args) {

        Asignatura asignatura = new Asignatura("Base de datos", 7);
        System.out.println(asignatura);

        Estudiante estudiante = new Estudiante("Lucas");
        estudiante.imprimir();

    }
}
