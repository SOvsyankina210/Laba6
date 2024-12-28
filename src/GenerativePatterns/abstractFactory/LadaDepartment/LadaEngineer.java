package GenerativePatterns.abstractFactory.LadaDepartment;

import GenerativePatterns.abstractFactory.Engineer;

public class LadaEngineer implements Engineer {
    @Override
    public String createCar() {
        return Engineer.super.createCar() + " Ладу";
    }
}
