package examen1;

import java.util.ArrayList;
import java.util.List;

public class Concierto {
    String localidad;
    String fecha;
    List<Asistente> asistentes;

    public Concierto(String localidad, String fecha) {
        this.localidad = localidad;
        this.fecha = fecha;
        this.asistentes = new ArrayList<>();
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Asistente> asistentes) {
        this.asistentes = asistentes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Concierto{");
        sb.append("localidad='").append(localidad).append('\'');
        sb.append(", fecha='").append(fecha).append('\'');
        sb.append(", asistentes=").append(asistentes);
        sb.append('}');
        return sb.toString();
    }
}

