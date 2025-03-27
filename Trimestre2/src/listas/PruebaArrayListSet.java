package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class PruebaArrayListSet {
    public static void main(String[] args) {

        Random r = new Random();
        int[] numerosIniciales = new int[5];
        for (int i = 0; i < numerosIniciales.length; i++)
            numerosIniciales[i] = r.nextInt(5);

        System.out.println("numerosIniciales :: " + Arrays.toString(numerosIniciales));

        ArrayList<Integer> numerosUnicos = new ArrayList<>();
        for (int numero : numerosIniciales) {
            boolean estaEnElArrayList = false;
            for (int numeroArrayList : numerosUnicos)
                if (numero == numeroArrayList)
                    estaEnElArrayList = true;
            if (!estaEnElArrayList)
                numerosUnicos.add(numero);
            System.out.println("numerosUnicos (comprobamos el " + numero + ") :: " + numerosUnicos);
        }

        HashSet<Integer> numerosUnicosHash = new HashSet<>();
        for (int numero : numerosIniciales)
            numerosUnicosHash.add(numero);
        System.out.println("numerosUnicosHash :: " + numerosUnicosHash);



    }
}
