package repaso;

public class Smartphone {

    private String marca;
    private String modelo;
    private double precio;
    private int almacenamiento;

    public Smartphone(String marca, String modelo, double precio, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
    }

    public Smartphone(String marca, String modelo) {
        this(marca, modelo, 699, 64);
    }

    public String toString() {
        return marca + " " + modelo + " - " + precio + "€, " + almacenamiento + "GB";
    }

}
