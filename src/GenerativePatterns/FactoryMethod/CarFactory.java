package GenerativePatterns.FactoryMethod;

class CarFactory implements Factory {
    @Override
    public Car createCar(String model) {
        switch (model.toLowerCase()) {
            case "lada":
                return new Lada();
            case "niva":
                return new Niva();
            default:
                return null; // Or throw an exception
        }
    }
}