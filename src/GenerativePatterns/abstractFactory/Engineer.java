package GenerativePatterns.abstractFactory;

public interface Engineer {
    default String createCar() {
        return "Инженер разрабатывает";
    }
}
