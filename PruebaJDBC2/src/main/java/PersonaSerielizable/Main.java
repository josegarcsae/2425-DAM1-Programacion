package PersonaSerielizable;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random nicoRandom = new Random();
        Persona[] personas = new Persona[5];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
            personas[i].edad = 10 + nicoRandom.nextInt(60);
            personas[i].nombre = "Persona " + (i + 1);
        }
        //Guardar personas en un archivo
        String nombreArchivo = "personas.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            for (Persona persona : personas) {
                oos.writeObject(persona);
            }
            Alumno alumno = new Alumno();
            alumno.nombre = "Alumno";
            alumno.edad = 22;
            alumno.nuss = "0523252";
            oos.writeObject(alumno);
            System.out.println("Personas guardadas en el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar las personas: " + e.getMessage());
        }

        // Leer personas desde el archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            for (int i = 0; i < personas.length + 1; i++) {
                Object o = ois.readObject();
                if (o instanceof Alumno) {
                    Alumno persona = (Alumno) o;
                    System.out.println("Alumno " + (i + 1) + ": " + persona.nombre + ", Edad: " + persona.edad + ", NUSS: " + persona.nuss);
                } else if (o instanceof Persona) {
                    Persona persona = (Persona) o;
                    System.out.println("Persona " + (i + 1) + ": " + persona.nombre + ", Edad: " + persona.edad);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer las personas: " + e.getMessage());
        }


    }
}
