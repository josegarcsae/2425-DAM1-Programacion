package equalsYhashcode;

import java.util.Objects;

public class Alumno {

    int dni;
    String nombre;
    String apellidos;
    String telefono;

    public Alumno(int dni, String nombre, String apellidos, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Alumno alumno)) return false;
        return dni == alumno.dni && telefono.equals(((Alumno) o).telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
