import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgendaBD {

    private final static String URL = "jdbc:mariadb://192.168.17.38:3306/agendam";
    private final static String USER = "guzman";
    private final static String PASSWORD = "guzman";

    public static void insertarUnNuevoContacto(Contacto contacto) {

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

    public static List<Contacto> buscarPorNombre(String nombreBuscado) {

        List<Contacto> contactos = new ArrayList<>();

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
                Contacto nuevo = new Contacto(id, nombre, apellidos);
                nuevo.setApodo(apodo);
                nuevo.setInstagram(instagram);
                contactos.add(nuevo);
            }

            conexion.close();

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

        return contactos;

    }

    public static List<Contacto> cargaTodaLaAgenda() {

        List<Contacto> contactos = new ArrayList<>();

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
                Contacto nuevo = new Contacto(id, nombre, apellidos);
                nuevo.setApodo(apodo);
                nuevo.setInstagram(instagram);
                contactos.add(nuevo);
            }

            conexion.close();

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

        return contactos;

    }

}
