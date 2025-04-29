public class ExamenEj2 {
    public static void main(String[] args) {
        int limite = 20;
        long numero = limite; // Empezamos con el número más grande del rango
        boolean encontrado = false;

        // Seguimos aumentando el número hasta encontrar uno que sea divisible por todos
        while (!encontrado) {
            boolean divisiblePorTodos = true;

            // Comprobamos si el número es divisible por todos los números de 1 a limit
            for (int i = 1; i <= limite; i++) {
                if (numero % i != 0) { // Si no es divisible por algún número
                    divisiblePorTodos = false;
                    break;
                }
            }

            // Si es divisible por todos, hemos encontrado el número
            if (divisiblePorTodos) {
                encontrado = true;
            } else {
                numero += limite; // Incrementamos en pasos de 20 para acelerar un poco
            }
        }

        System.out.println("El menor número divisible por todos los números de 1 a " + limite + " es: " + numero);
    }
}
