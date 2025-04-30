import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgendamInsertMAL {

    public static void main(String[] args) {

        String url = "jdbc:mariadb://192.168.17.38:3306/agendam";
        String usuario = "guzman";
        String contraseña = "guzman";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            System.out.println("Conexión exitosa a la base de datos.");

            // Consulta SQL
            String sql = "INSERT INTO contactos(nombre, apellidos, apodo) " +
                    "VALUES ('Manolo','Casado',\"Manolo el del bombo\")";

            PreparedStatement sentencia = conexion.prepareStatement(sql);
            int filasAfectadas = sentencia.executeUpdate();

            System.out.println("Hemos insertado " + filasAfectadas + " filas");

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

    }

}
