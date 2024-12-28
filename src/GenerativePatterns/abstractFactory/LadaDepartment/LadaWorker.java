package GenerativePatterns.abstractFactory.LadaDepartment;

import GenerativePatterns.abstractFactory.Worker;

public class LadaWorker implements Worker {
    @Override
    public String buildCar() {
        return Worker.super.buildCar()+ " Ладу";
    }
}
