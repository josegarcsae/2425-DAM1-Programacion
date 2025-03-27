package ejercicio2;

import java.util.Arrays;
import java.util.Random;

public class Primos {

    public static void main(String[] args) {

        int[] primos = new int[0];

        Random r = new Random();
        int[] aleatorios = new int[20000];
        for (int i = 0; i < aleatorios.length; i++)
            aleatorios[i] = r.nextInt(1000);
        System.out.println(Arrays.toString(aleatorios));

        for (int numero : aleatorios) {
            if (esPrimo(numero)) {
                // Añadir al array
                primos = añadirPrimo(numero, primos);
            }
        }
    }

    private static int[] añadirPrimo(int numero, int[] primos) {
        int[] primosTemp = primos;
        primos = new int[primos.length+1];
        for (int i = 0; i < primos.length; i++) {
            primos[i] = primosTemp[i];
        }
        primos[primos.length-1] = numero;
        return primos;
    }

    private static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
