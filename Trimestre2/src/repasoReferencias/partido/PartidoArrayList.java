package repasoReferencias.partido;

import java.util.ArrayList;

public class PartidoArrayList {

    ArrayList<Accion> participantes;
    int last;

    public PartidoArrayList() {
        participantes = new ArrayList();
        last = 0;
    }

    void addParticipante(Persona participante) {
        participantes.add(participante);
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
