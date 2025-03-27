package repaso.mascotas;

public class Perro extends Mascota {
    public boolean estaLadrando;
    public Perro(int edad, String nombre, boolean estaLadrando) {
        super(edad, nombre);
        this.estaLadrando = estaLadrando;
    }
}
