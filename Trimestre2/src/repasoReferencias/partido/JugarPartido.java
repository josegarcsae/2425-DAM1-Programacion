package repasoReferencias.partido;

public class JugarPartido {
    public static void main(String[] args) {

        Partido partidillo = new Partido();
        partidillo.addParticipante(new Jugador("Juan Luis", 4));
        partidillo.addParticipante(new Jugador("Marta", 13));
        Arbitro tiodenegro = new Arbitro("Fernando", false);
        partidillo.addParticipante(tiodenegro);
        partidillo.iniciarPartido();
    }
}
