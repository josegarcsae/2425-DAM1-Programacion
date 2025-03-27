package videoclub;

import java.time.LocalDate;

public class Prestamo {

    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fecha;
    private int diasPrestamo;

    public Prestamo(Pelicula pelicula, Cliente cliente, int diasPrestamo) {
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.diasPrestamo = diasPrestamo;
    }

    public Prestamo(Pelicula pelicula, Cliente cliente) {
        this(pelicula, cliente, 2);
    }

    public LocalDate getFechaDevolucion() {
        return fecha.plusDays(diasPrestamo);
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return cliente.getNombre() + " ha alquilado " + pelicula.getTitulo() +
                " y la tiene que devolver el " + getFechaDevolucion();
    }

}
