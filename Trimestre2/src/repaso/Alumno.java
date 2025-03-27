package repaso;

public class Alumno {
    public String nombre;
    public String apellidos;
    public String DNI;
    public int[] examenes;
    public int[] trabajos;

    // Constructores, getters, setters y demás métodos.
    // NO escribir nada, ya estaría todo hecho

    // Añadir un trabajo al array, es dinámico, crece al añadir
    public void addTrabajo(int nota) {
        // Creamos un array temporal nuevo
        int[] nuevo = new int[trabajos.length + 1];
        // Copiamos el array
        for (int i = 0; i < trabajos.length; i++)
            nuevo[i] = trabajos[i];
        // Añadimos la nueva nota
        nuevo[nuevo.length - 1] = nota;
        // Reasignamos la variable
        trabajos = nuevo;
    }

    // Este método devuelve la nota final, que es la media de los
    // exámenes (70%) de la nota, y de los trabajos (30%) de la nota
    public double getNotaFinal() {
        // Calculamos media examenes
        int sumaExamenes = 0;
        for (int examen : examenes)
            sumaExamenes += examen;
        double mediaExamenes = sumaExamenes / examenes.length;
        // Calculamos media trabajos
        int sumaTrabajos = 0;
        for (int trabajo : trabajos)
            sumaTrabajos += trabajo;
        double mediaTrabajos = sumaTrabajos / trabajos.length;
        // Devolvemos la nota final
        return mediaExamenes * 0.7 + mediaTrabajos * 0.3;
    }

}
