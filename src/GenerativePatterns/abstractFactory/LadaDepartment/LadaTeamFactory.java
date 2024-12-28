package GenerativePatterns.abstractFactory.LadaDepartment;

import GenerativePatterns.abstractFactory.CarTeamFactory;
import GenerativePatterns.abstractFactory.Engineer;
import GenerativePatterns.abstractFactory.Manager;
import GenerativePatterns.abstractFactory.Worker;

public class LadaTeamFactory implements CarTeamFactory {
    @Override
    public Engineer getEngineer() {
        return new LadaEngineer();
    }

    @Override
    public Manager getManager() {
        return new LadaManager();
    }

    @Override
    public Worker getWorker() {
        return new LadaWorker();
    }
}
