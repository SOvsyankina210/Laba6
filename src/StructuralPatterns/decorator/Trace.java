package StructuralPatterns.decorator;

public class Trace {
    public static void main(String[] args) {
        Car car=new flyVaz(new VazTrunk(new Vaz()));
        System.out.println(car.drive());
    }
}
