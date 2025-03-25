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
    public void añadirPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
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

}
