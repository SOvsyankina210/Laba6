package StructuralPatterns.decorator;

public class Vaz implements Car{

    @Override
    public String drive() {
        return "Vaz "+Car.super.drive();
    }

}
