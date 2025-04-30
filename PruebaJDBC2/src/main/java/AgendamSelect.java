import java.sql.*;

public class AgendamSelect {

    public static void main(String[] args) {

        String url = "jdbc:mariadb://192.168.17.38:3306/agendam";
        String usuario = "guzman";
        String contraseña = "guzman";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            System.out.println("Conexión exitosa a la base de datos.");

            // Consulta SQL
            String sql = "SELECT idContacto, nombre, apellidos, apodo FROM contactos";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("idContacto");
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                String apodo = resultado.getString("apodo");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Apodo: " + apodo);
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

    }

}
