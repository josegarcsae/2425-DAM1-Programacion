package PersonaSerielizable;

public class Alumno extends Persona implements Evaluable {
    String nuss;

    @Override
    public void ponerNota() {
        System.out.println("Tienes un 7");
    }
}
