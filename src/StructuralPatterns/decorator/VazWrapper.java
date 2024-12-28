package StructuralPatterns.decorator;

public class VazWrapper implements Car{

    Car car;

    public VazWrapper(Car car) {
        this.car = car;
    }

    @Override
    public String drive() {
        return Car.super.drive();
    }
}
