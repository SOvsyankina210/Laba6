package StructuralPatterns.Proxy;

public class Lada implements Car {

    private String serialNumber;

    public Lada(String serialNumber) {
        this.serialNumber = serialNumber;
        self();
    }

    public void self(){
        System.out.println("Продана серийном номером!"+ serialNumber);
    }


    @Override
    public void drive() {
        System.out.println("Лада с серийном номером "+serialNumber+" уехала");
    }
}
