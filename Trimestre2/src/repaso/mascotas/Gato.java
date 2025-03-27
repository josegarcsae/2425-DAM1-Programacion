package repaso.mascotas;

public class Gato extends Mascota {
    public boolean estaMaullando;
    public Gato(int edad, String nombre, boolean estaMaullando) {
        super(edad, nombre);
        this.estaMaullando = estaMaullando;
    }
}
