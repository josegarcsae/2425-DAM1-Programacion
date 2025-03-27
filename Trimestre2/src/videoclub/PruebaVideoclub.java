package videoclub;

import java.util.ArrayList;

public class PruebaVideoclub {
    public static void main(String[] args) {

        Videoclub videoclub = new Videoclub();
        videoclub.añadirPelicula(new Pelicula(1, "Charlie y la fábrica de chocolate"));
        videoclub.añadirPelicula(new Pelicula(2, "Matrix"));
        videoclub.añadirPelicula(new Pelicula(3, "Harry Potter"));
        videoclub.añadirPelicula(new Pelicula(4, "Rambo"));
        videoclub.añadirPelicula(new Pelicula(5, "Rick y Morty (la película)"));

        Pelicula p = videoclub.buscaPelicula(1);
        System.out.println(p != null ? p : "No se ha encontrado la pelicula");

        videoclub.añadirCliente(new Cliente(100, "Javier"));
        videoclub.añadirCliente(new Cliente(101, "David"));
        videoclub.añadirCliente(new Cliente(102, "Marta"));
        videoclub.añadirCliente(new Cliente(103, "Leticia"));
        Cliente c = videoclub.buscaCliente(100);
        System.out.println(c != null ? c : "No se ha encontrado el cliente");

        try {
            videoclub.añadirPrestamo(
                    videoclub.buscaCliente(100),
                    videoclub.buscaPelicula(1)
            );
            videoclub.añadirPrestamo(
                    videoclub.buscaCliente(102),
                    videoclub.buscaPelicula(5)
            );
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Todos los prestamos :: " + videoclub.getPrestamos());
        System.out.println("Peliculas de Javi :: " + videoclub.getPrestamos(100));

//        boolean devuelta = videoclub.devolucion(5, 102);
//        System.out.println("Marta devuelve la pelicula :: " + (devuelta ? "sí" : "no"));

        ArrayList<Prestamo> listadoMorosos = videoclub.prestamosMorosos();
        System.out.println("Morosos :: " + listadoMorosos);

    }
}
