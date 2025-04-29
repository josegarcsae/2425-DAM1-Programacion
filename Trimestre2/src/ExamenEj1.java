public class ExamenEj1 {
    public static void main(String[] args) {
        int limite = 1000;
        int suma = 0;

        // Iterar por todos los números menores a 1000
        for (int i = 1; i < limite; i++) {
            // Si el número es múltiplo de 3 o de 5, lo sumamos
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de todos los múltiplos de 3 o 5 menores a " + limite + " es: " + suma);
    }
}
