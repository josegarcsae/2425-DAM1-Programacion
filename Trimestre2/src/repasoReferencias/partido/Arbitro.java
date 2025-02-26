package repasoReferencias.partido;

public class Arbitro extends Persona {

    boolean tomatazo;

    public Arbitro(String nombre, boolean tomatazo) {
        super(nombre);
        this.tomatazo = tomatazo;
    }

    public void realizarAccion() {
        System.out.println("Soy el árbitro y me llamo " + nombre);
    }

    void recibirTomatazo() {
        tomatazo = true;
        if (Math.random() > 0.3)
            System.out.println("¡¡AY!!");
        else
            System.out.println("Esquivado");
    }
}
