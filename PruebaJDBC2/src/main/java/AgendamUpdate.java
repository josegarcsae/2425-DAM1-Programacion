import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgendamUpdate {

    public static void main(String[] args) {

        String url = "jdbc:mariadb://192.168.17.38:3306/agendam";
        String usuario = "guzman";
        String contraseña = "guzman";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            System.out.println("Conexión exitosa a la base de datos.");

            conexion.setAutoCommit(false);
            System.out.println("He desactivado el autocommit");

            // Consulta SQL
            String sql = "UPDATE contactos SET apodo = ? WHERE upper(nombre) LIKE ?";

            PreparedStatement sentencia = conexion.prepareStatement(sql);
            int i = 1;
            sentencia.setString(i++, "El del padre con barba");
            sentencia.setString(i++, "INDI%");
            int filasAfectadas = sentencia.executeUpdate();

            System.out.println("Hemos actualizado " + filasAfectadas + " filas");

            conexion.commit();

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

    }

}
