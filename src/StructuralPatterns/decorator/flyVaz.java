package StructuralPatterns.decorator;

public class flyVaz extends VazWrapper {

    public flyVaz(Car car) {
        super(car);
    }

    public String fly(){
        return " и летает";
    }

    @Override
    public String drive() {
        return car.drive()+fly();
    }
}
