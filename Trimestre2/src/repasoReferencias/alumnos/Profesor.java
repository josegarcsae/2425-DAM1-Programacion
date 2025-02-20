package repasoReferencias.alumnos;

public class Profesor {

    String nombre;
    String apellidos;
    String asignatura;

    Alumno[] alumnos = new Alumno[30];

    public Profesor(String nombre, String apellidos, String asignatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asignatura = asignatura;
    }

    public void addAlumno(Alumno nuevoAlumno) {
        boolean insertado = false;
        for (int i = 0; i < 30; i++) {
            if (alumnos[i] == null && !insertado) {
                alumnos[i] = nuevoAlumno;
                insertado = true;
            }
        }
    }

    @Override
    public String toString() {
        String cadenaAlumnos = "";
        for (Alumno a : alumnos) {
            if (a != null) {
                cadenaAlumnos += a.nombre + " " + a.apellidos + ",";
            }
        }
        return "Soy el profesor " + nombre + " " + apellidos
                + " y doy la asignatura " + asignatura
                + " y tengo estos alumnos: " + cadenaAlumnos;
    }
}
