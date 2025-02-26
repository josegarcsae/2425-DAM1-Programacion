package repasoReferencias.partido;

public class Partido {

    Persona[] participantes = new Persona[50];
    int last = 0;

    void addParticipante(Persona participante) {
        participantes[last++] = participante;
//        participantes[last] = participante;
//        last++;
    }

    void iniciarPartido() {
        for (Persona p : participantes) {
            if (p != null) {
                p.realizarAccion();
                if (p instanceof Arbitro) {
                    ((Arbitro) p).recibirTomatazo();
                }
            }
        }
    }

}
