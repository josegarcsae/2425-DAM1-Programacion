package repaso;

public class Triangulo {
        public static void main(String[] args) {
            int altura = 5;
            // Parte creciente
            for (int i = 1; i <= altura; i++) { // Error B: i = 0 por i = 1
                for (int j = 1; j < i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
            // Parte decreciente
            for (int i = altura; i > 0; i--) { // Error C: i >= 0 por i > 0
                for (int j = 1; j <= i; j++) {
                    System.out.print(j); // Error A: Número impreso -- cambiar por j
                }
                System.out.println();
            }
        }

}
