package repasoReferencias.partido;

public abstract class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    abstract void realizarAccion();

}
