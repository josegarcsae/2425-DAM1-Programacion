package repaso;

public class SmartphoneMain {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("Samsung", "Galaxy S23", 799.99, 128);
        Smartphone phone2 = new Smartphone("Apple", "iPhone 14");
        System.out.println(phone1); // Samsung Galaxy S23 - 799.99€, 128GB
        System.out.println(phone2); // Apple iPhone 14 - 699.0€, 64GB
    }
}
