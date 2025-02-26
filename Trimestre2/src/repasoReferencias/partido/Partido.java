package repasoReferencias.partido;

public class Partido {

    Accion[] participantes;
    int last;

    public Partido() {
        participantes = new Accion[50];
        last = 0;
    }

    void addParticipante(Persona participante) {
        participantes[last++] = participante;
//        participantes[last] = participante;
//        last++;
    }

    void iniciarPartido() {
        for (Accion p : participantes) {
            if (p != null) {
                p.realizarAccion();
                if (p instanceof Arbitro) {
                    ((Arbitro) p).recibirTomatazo();
                }
            }
        }
    }

}
