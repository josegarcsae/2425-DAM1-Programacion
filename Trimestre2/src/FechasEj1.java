import java.time.DayOfWeek;
import java.time.LocalDate;

public class FechasEj1 {
    public static void main(String[] args) {

        final int ANALISIS = 5;
        final int DESARROLLO = 15;
        final int PRUEBAS = 7;

        LocalDate now = LocalDate.now();
        LocalDate inicioDelProyecto = now.with(DayOfWeek.MONDAY).plusWeeks(1);
        System.out.println("Ahora: " + now);
        System.out.println("Inicio del proyecto: " + inicioDelProyecto);

        LocalDate inicioAnalisis = inicioDelProyecto;
        LocalDate finAnalisis = inicioAnalisis.plusDays(ANALISIS-1);
        System.out.println("Fechas analisis: " + inicioAnalisis + " a " + finAnalisis);

    }

//    public LocalDate sumaDiasLaborables(LocalDate inicio, int dias) {
//
////        fecha.getDayOfWeek() != DayOfWeek.SATURDAY
//
//    }

}
