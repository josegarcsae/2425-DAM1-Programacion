package ejercicio1;

public class Estudiante {
    String nombre;
    Asignatura[] asignaturas;
    int ultimo = 0;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        asignaturas = new Asignatura[10];
    }

    public void addAsignatura(Asignatura nuevaAsignatura) {
        if (ultimo < 10)
            asignaturas[ultimo++] = nuevaAsignatura;
        else
            System.out.println("No caben más asignaturas");
    }

    public double media() {
        int suma = 0;
        for (Asignatura a : asignaturas)
            suma += a.nota;
        return suma/asignaturas.length;
    }

    public void imprimir() {
        for (Asignatura a : asignaturas)
            System.out.println(a);
    }
}
