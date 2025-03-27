package videoclub;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Videoclub {

    ArrayList<Pelicula> peliculas;
    ArrayList<Cliente> clientes;
    ArrayList<Prestamo> prestamos;

    public Videoclub() {
        this.peliculas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void añadirCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    public void añadirPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }
    public void añadirPrestamo(Cliente cliente, Pelicula pelicula)
        throws NotFoundException {
        if (!(cliente != null && pelicula != null))
            throw new NotFoundException(cliente == null ? "No se ha encontrado al cliente" :
                    "No se ha encontrado la pelicula");
        else
            this.prestamos.add(new Prestamo(pelicula, cliente));
    }

    public Pelicula buscaPelicula(int codigo) {
        for (Pelicula pelicula : peliculas) {
            if (codigo == pelicula.getCodigo()) {
                return pelicula;
            }
        }
        return null;
    }
    public Cliente buscaCliente(int numeroCarnet) {
        for (Cliente cliente : clientes) {
            if (numeroCarnet == cliente.getNumeroCarnet()) {
                return cliente;
            }
        }
        return null;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public ArrayList<Prestamo> getPrestamos(int numeroCarnet) {
        ArrayList<Prestamo> prestamosUsuario = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCliente().getNumeroCarnet() == numeroCarnet)
                prestamosUsuario.add(prestamo);
        }
        return prestamosUsuario;
    }

    public boolean devolucion(int codigoPelicula, int numeroCarnet) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCliente().getNumeroCarnet() == numeroCarnet
                && prestamo.getPelicula().getCodigo() == codigoPelicula) {
                prestamos.remove(prestamo);
                return true;
            }
        }
        return false;
    }
    public ArrayList<Prestamo> prestamosMorosos() {
        ArrayList<Prestamo> morosos = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCliente().getNombre().toLowerCase().equals("marta")) { // MAL, corregir
                morosos.add(prestamo);
            }
        }
        return morosos;
    }

}
