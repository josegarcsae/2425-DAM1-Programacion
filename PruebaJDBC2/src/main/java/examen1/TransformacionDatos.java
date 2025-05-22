package examen1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransformacionDatos {

    public static void main(String[] args) {

        List<Concierto> datos = datosEjemplo();

        Map<String, Map<String, Integer>> entradasPorLocalidadesPorDNI = new HashMap<>();

        for (Concierto concierto : datos) {

            String localidad = concierto.getLocalidad();
            String fecha = concierto.getFecha();

            for (Asistente asistente : concierto.getAsistentes()) {

                String dni = asistente.getDni();
                int entradas = asistente.getEntradas();

                if (!entradasPorLocalidadesPorDNI.containsKey(dni))
                    entradasPorLocalidadesPorDNI.put(dni, new HashMap<>());

                Map<String, Integer> entradasPorLocalidades = entradasPorLocalidadesPorDNI.get(dni);
                if (!entradasPorLocalidades.containsKey(localidad))
                    entradasPorLocalidades.put(localidad, entradas);
                else
                    entradasPorLocalidades.put(localidad, entradas + entradasPorLocalidades.get(localidad));

            }

        }

        System.out.println(entradasPorLocalidadesPorDNI);

        for (String dni : entradasPorLocalidadesPorDNI.keySet()) {
            Map<String, Integer> entradasPorLocalidades = entradasPorLocalidadesPorDNI.get(dni);
            for (String localidad : entradasPorLocalidades.keySet()) {
                int entradas = entradasPorLocalidades.get(localidad);
                System.out.println(dni + " | " + localidad + " | " + entradas);
                guardarEnBD(dni, localidad, entradas);
            }
        }

//        salidaEjemplo();

    }

    private final static String URL = "jdbc:mariadb://192.168.17.38:3306/agendam";
    private final static String USER = "guzman";
    private final static String PASSWORD = "guzman";

    private static void guardarEnBD(String dni, String localidad, int entradas) {

        try (Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String SQL = "INSERT INTO conciertos(dni,localidad,entradas) VALUES (?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(SQL);
            stmt.setString(1, dni);
            stmt.setString(2, localidad);
            stmt.setInt(3, entradas);
            int filasAfectadas = stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static List<Concierto> datosEjemplo() {
        List<Concierto> conciertos = new ArrayList<>();
        Concierto vigo = new Concierto("Vigo", "04/06/2025");
        vigo.getAsistentes().add(new Asistente("123B", 4));
        vigo.getAsistentes().add(new Asistente("789Z", 3));
        conciertos.add(vigo);
        Concierto vigo2 = new Concierto("Vigo", "14/06/2025");
        vigo2.getAsistentes().add(new Asistente("456G", 1));
        vigo2.getAsistentes().add(new Asistente("789Z", 2));
        conciertos.add(vigo2);
        Concierto santiago = new Concierto("Santiago", "14/07/2025");
        santiago.getAsistentes().add(new Asistente("123B", 2));
        santiago.getAsistentes().add(new Asistente("456G", 2));
        santiago.getAsistentes().add(new Asistente("789Z", 3));
        conciertos.add(santiago);
        return conciertos;
    }

    private static void salidaEjemplo() {
        Map<String, Integer> entradasPorLocalidades = new HashMap<>();
        entradasPorLocalidades.put("Gijón", 3);
        entradasPorLocalidades.put("Vigo", 5);

        Map<String, Map<String, Integer>> entradasPorLocalidadesPorDNI = new HashMap<>();
        entradasPorLocalidadesPorDNI.put("123B", entradasPorLocalidades);
        System.out.println(entradasPorLocalidadesPorDNI);
    }

}
