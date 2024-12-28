package GenerativePatterns.abstractFactory;

public interface Manager {
    default String selfCar(){
        return "менеджер продаёт";
    }
}
