package repasoReferencias.vuelos;

public class Pasajero {

    String nombre;
    String dni;

    Avion embarcadoEn;

    public Pasajero(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Soy " + nombre + " y tengo DNI " + dni
                + (embarcadoEn != null ? " y estoy embarcado en " + embarcadoEn.matricula : "");
    }
}
