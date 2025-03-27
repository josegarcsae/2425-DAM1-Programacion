package repaso.mascotas;

import java.util.ArrayList;

public class Mascota {
    public int edad;
    public String nombre;

    public Mascota(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String mayorEdad(ArrayList<Mascota> mascotas) {
        int edadMayor = 0;
        String nombreMayor = null;
        for (Mascota mascota : mascotas) {
            if (mascota.edad > edadMayor) {
                edadMayor = mascota.edad;
                nombreMayor = mascota.nombre;
            }
        }
        //return nombreMayor;

        Mascota mayor = null;
        for (Mascota mascota : mascotas) {
            if (mascota == null || mascota.edad > mayor.edad) {
                mayor = mascota;
            }
        }
        return mayor != null ? mayor.nombre : "No hay mascotas";
    }

}