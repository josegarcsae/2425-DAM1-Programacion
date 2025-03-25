package videoclub;

public class PruebaVideoclub {
    public static void main(String[] args) {

        Videoclub videoclub = new Videoclub();
        videoclub.añadirPelicula(
                new Pelicula(1, "Charlie y la fábrica de chocolate"));

        Pelicula p = videoclub.buscaPelicula(1);
        System.out.println(p != null ? p : "No se ha encontrado la pelicula");

        videoclub.añadirCliente(
                new Cliente(100, "Javier")
        );
        Cliente c = videoclub.buscaCliente(100);
        System.out.println(c != null ? c : "No se ha encontrado el cliente");

    }
}
