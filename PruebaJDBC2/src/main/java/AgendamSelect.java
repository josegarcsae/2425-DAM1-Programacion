import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgendamSelect {

    public static void main(String[] args) {

        List<Contacto> contactosBD = recuperaTodosLosContactosDeBD();
        System.out.println(contactosBD);

    }

    private static List<Contacto> recuperaTodosLosContactosDeBD() {

        String url = "jdbc:mariadb://192.168.17.38:3306/agendam";
        String usuario = "guzman";
        String contraseña = "guzman";

        List<Contacto> contactos = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
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
                Contacto nuevoContacto = new Contacto(id, nombre, apellidos);
                nuevoContacto.setApodo(apodo);
                contactos.add(nuevoContacto);
            }

            conexion.close();

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

        return contactos;
    }

}
