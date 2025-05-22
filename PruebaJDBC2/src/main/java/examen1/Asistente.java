package examen1;

public class Asistente {
    String dni;
    int entradas;

    public Asistente(String dni, int entradas) {
        this.dni = dni;
        this.entradas = entradas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistente{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", entradas=").append(entradas);
        sb.append('}');
        return sb.toString();
    }
}
