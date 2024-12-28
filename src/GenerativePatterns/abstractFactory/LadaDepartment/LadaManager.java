package GenerativePatterns.abstractFactory.LadaDepartment;

import GenerativePatterns.abstractFactory.Manager;

public class LadaManager implements Manager {
    @Override
    public String selfCar() {
        return Manager.super.selfCar()+ " Ладу";
    }
}
