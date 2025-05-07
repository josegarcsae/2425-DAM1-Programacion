import java.sql.*;
import java.util.Scanner;

public class Agenda {

    private final static String URL = "jdbc:mariadb://192.168.17.38:3306/agendam";
    private final static String USER = "guzman";
    private final static String PASSWORD = "guzman";

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int num = -1;
            while (num != 0) {
                System.out.println("""
                        Introduce la opción que desees:
                        1) Mostrar toda la agenda
                        2) Buscar en la agenda por nombre
                        3) Insertar un nuevo elemento en la agenda
                        4) Actualizar un elemento en la agenda
                        5) Eliminar un elemento de la agenda
                        0) Salir
                        """);
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        muestraTodaAgenda();
                        break;
                    case 2:
                        System.out.println("Introduce el nombre para buscar");
                        String nombre = sc.next();
                        buscarPorNombre(nombre);
                        break;
                    case 3:
                        Contacto contacto = pedirNuevoContacto(sc);
                        insertarUnNuevoContacto(contacto);
                }
            }
            System.out.println("Adios");
        }

    }

    private static void insertarUnNuevoContacto(Contacto contacto) {

        try (Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión exitosa a la base de datos.");

            // Consulta SQL
            String sql = "INSERT INTO contactos(nombre, apellidos, apodo, relacion, telefono, instagram, email, empresa) " +
                    "VALUES (?,?,?,?,?,?,?,?)";

            PreparedStatement sentencia = conexion.prepareStatement(sql);
            int i = 1;
            sentencia.setString(i++, contacto.getNombre());
            sentencia.setString(i++, contacto.getApellidos());
            sentencia.setString(i++, contacto.getApodo());
            sentencia.setString(i++, contacto.getRelacion());
            sentencia.setString(i++, contacto.getTelefono());
//            sentencia.setDate(i++, contacto.getCumpleanios());
            sentencia.setString(i++, contacto.getInstagram());
            sentencia.setString(i++, contacto.getEmail());
            sentencia.setString(i++, contacto.getEmpresa());
            int filasAfectadas = sentencia.executeUpdate();

            System.out.println("Hemos insertado " + filasAfectadas + " filas");

            conexion.commit();

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

    }

    private static Contacto pedirNuevoContacto(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Apellidos: ");
        String apellidos = sc.next();
        System.out.print("Apodo: ");
        String apodo = sc.next();
        Contacto nuevo = new Contacto(null, nombre, apellidos);
        nuevo.setApodo(apodo);
        return nuevo;
    }

    private static void buscarPorNombre(String nombreBuscado) {

        try {
            Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");

            // Consulta SQL
            String sql = "SELECT idContacto, nombre, apellidos, apodo, instagram FROM contactos WHERE upper(nombre) LIKE ?";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, "%" + nombreBuscado.toUpperCase() + "%");
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("idContacto");
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                String apodo = resultado.getString("apodo");
                String instagram = resultado.getString("instagram");
                System.out.println(nombre + " " + apellidos + " (" + apodo + ") " + (instagram != null ? "@" + instagram : ""));
            }

            conexion.close();

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

    }

    private static void muestraTodaAgenda() {

        try {
            Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");

            // Consulta SQL
            String sql = "SELECT idContacto, nombre, apellidos, apodo, instagram FROM contactos";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("idContacto");
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                String apodo = resultado.getString("apodo");
                String instagram = resultado.getString("instagram");
                System.out.println(nombre + " " + apellidos + " (" + apodo + ") " + (instagram != null ? "@" + instagram : ""));
            }

            conexion.close();

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

    }
}
