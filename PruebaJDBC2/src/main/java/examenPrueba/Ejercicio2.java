package examenPrueba;

import java.sql.*;

public class Ejercicio2 {

    private final static String URL = "jdbc:mariadb://192.168.17.38:3306/agendam";
    private final static String USER = "guzman";
    private final static String PASSWORD = "guzman";

    public static void main(String[] args) {

        getFromSQL("select nombre, apellidos, apodo, instagram from contactos");

    }


    public static void getFromSQL(String SQL) {

        try (Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD)) {

            PreparedStatement ps = conexion.prepareStatement(SQL);
            ResultSet rset = ps.executeQuery();

            ResultSetMetaData rsmd = rset.getMetaData();
            int numeroColumnas = rsmd.getColumnCount();


            while (rset.next()) {

                for (int i = 1; i <= numeroColumnas; i++) {
                    System.out.print(rset.getString(i) + ";");
                }
                System.out.println();

                // Avanzada
//                for (int i = 1; i <= numeroColumnas; i++) {
//                    String columnName = rsmd.getColumnName(i);
//                    String columnTypeName = rsmd.getColumnTypeName(i);
//                    int columnType = rsmd.getColumnType(i);
////                    System.out.println(columnName + " :: " + columnTypeName + " :: " + columnType);
//
//                    if (columnType == 12) {
//                        String value = rset.getString(i);
//                        System.out.println(columnName + " :: " + value);
//                    }
//
//                }

            }

        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }

    }


}
