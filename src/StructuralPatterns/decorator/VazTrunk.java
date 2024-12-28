package StructuralPatterns.decorator;

public class VazTrunk extends VazWrapper{
    public VazTrunk(Car car){
        super(car);
    }

    public String driveOffrond(){
        return " по горам";
    }

    @Override
    public String drive() {
        return car.drive()+ driveOffrond();
    }
}
