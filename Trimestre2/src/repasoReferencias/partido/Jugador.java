package repasoReferencias.partido;

public class Jugador extends Persona {
    int numero;

    public Jugador(String nombre, int numero) {
        super(nombre);
        this.numero = numero;
    }

    public void realizarAccion() {
        System.out.println("Soy " + nombre + " y tengo el numero " + numero);
    }
}
