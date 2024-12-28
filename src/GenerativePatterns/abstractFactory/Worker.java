package GenerativePatterns.abstractFactory;

public interface Worker {
    default String buildCar(){
        return "рабочий собирает";
    }
}
