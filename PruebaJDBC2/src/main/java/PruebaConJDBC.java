import java.sql.*;

public class PruebaConJDBC {

    public static void main(String[] args) {

        String url = "jdbc:mariadb://192.168.17.38:3306/tiendam";
        String usuario = "guzman";
        String contraseña = "guzman";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            System.out.println("Conexión exitosa a la base de datos.");

            // Consulta SQL
            String sql = "SELECT idProducto, nombre, precio, stock FROM productos";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("idProducto");
                String nombre = resultado.getString("nombre");
                float precio = resultado.getFloat("precio");
                int stock = resultado.getInt("stock");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

    }

}
