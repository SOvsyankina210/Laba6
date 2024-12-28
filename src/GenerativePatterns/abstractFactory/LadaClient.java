package GenerativePatterns.abstractFactory;

import GenerativePatterns.abstractFactory.LadaDepartment.LadaTeamFactory;

public class LadaClient {
    public static void main(String[] args) {
        CarTeamFactory TeamFactory=new LadaTeamFactory();
        System.out.println(TeamFactory.getEngineer().createCar());
        System.out.println(TeamFactory.getWorker().buildCar());
        System.out.println(TeamFactory.getManager().selfCar());
    }
}
