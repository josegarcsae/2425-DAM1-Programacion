package repasoReferencias.vuelos;

public class Avion {

    String numeroVuelo;
    String matricula;
    String modelo;
    String compañia;

    Pasajero[] pasaje = new Pasajero[50];

    public Avion(String matricula, String modelo, String compañia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.compañia = compañia;
    }

    void embarca(Pasajero pasajeroQueEmbarca) {
        boolean embarcado = false;
        for (int i = 0; i < pasaje.length; i++)
            if (pasaje[i] == null && !embarcado) {
                pasaje[i] = pasajeroQueEmbarca;
                pasajeroQueEmbarca.embarcadoEn = this;
                embarcado = true;
            }
    }

    @Override
    public String toString() {
        String pasajeros = "\n";
        for (int i = 0; i < pasaje.length; i++)
            if (pasaje[i] != null)
                pasajeros += pasaje[i] + "\n";
        return "Avión " + matricula + " con pasajeros " + pasajeros;
    }
}
