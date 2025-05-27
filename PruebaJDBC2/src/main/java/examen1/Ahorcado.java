package examen1;

import java.util.Random;

public class Ahorcado {

    public static void main(String[] args) {

        String[] palabras = {"arbol", "fuente", "cacahuete"};

        char[] letrasUtilizadas = new char[30];
        int intentosRestantes = 7;

        Random r = new Random();
        String palabra = palabras[r.nextInt(0, 2)];

        char[] letrasCubiertas = new char[palabra.length()];
        for (int i = 0; i < letrasCubiertas.length; i++)
            letrasCubiertas[i] = '_';

        System.out.println("La palabra es " + imprimirArray(letrasCubiertas));

        boolean noGanado = false;
        while (intentosRestantes > 0 && !noGanado) {

            System.out.println("Intento");
            intentosRestantes--;

        }

    }

    static String imprimirArray(char[] array) {
        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < array.length; i++)
//            builder.append(array[i]);
        builder.append(array);
        return builder.toString();
    }

}
