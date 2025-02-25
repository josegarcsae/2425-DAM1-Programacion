package repasoReferencias.vuelos;

public class PruebaAerea {
    public static void main(String[] args) {

        Avion avion1 = new Avion("EC5432", "A320", "Ryanair");
        System.out.println(avion1);

        Pasajero p1 = new Pasajero("Marta", "1A");
        avion1.embarca(p1);
        avion1.embarca(new Pasajero("Tomás", "B2"));
        avion1.embarca(new Pasajero("Jose Maria", "1432Z"));
        avion1.embarca(new Pasajero("Claudia", "14D"));

        System.out.println(avion1);

    }
}
