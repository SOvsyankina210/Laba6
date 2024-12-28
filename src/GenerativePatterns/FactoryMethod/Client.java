package GenerativePatterns.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Factory factory = new CarFactory(); //Using the CarFactory
        Car lada = factory.createCar("Lada");
        Car niva = factory.createCar("Niva");

        if (lada != null) System.out.println(lada.drive()); // Output: Лада выехала с завода
        if (niva != null) System.out.println(niva.drive()); // Output: Нива выехала с завода

    }
}