package StructuralPatterns.addapter;

public class AdapterLadaFactory extends CentralFactory implements LadaFactory{
    @Override
    public void createLada() {
    createCar();
    }

    @Override
    public void updateLada() {
    updateCar();
    }

    @Override
    public void selfLada() {
        selfCar();
    }
}
