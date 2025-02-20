package repasoReferencias.alumnos;

public class Alumno {

    String nombre;
    String apellidos;
    int numeroExpediente;

    Profesor profeAsignatura1;

    public Alumno(String nombre, String apellidos, int numeroExpediente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroExpediente = numeroExpediente;
    }

    @Override
    public String toString() {
        return "Hola, soy " + nombre + " " + apellidos
                + " y tengo el número de expediente " + numeroExpediente
                + " y me da clase " + (profeAsignatura1 != null ? profeAsignatura1.nombre : "-");
    }
}
