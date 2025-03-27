package ejercicio1;

public class Asignatura {
    String nombre;
    int nota;

    public Asignatura(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String toString() {
        return nombre + ": " + nota;
    }

}
